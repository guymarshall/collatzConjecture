package com.marshall.guy;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

//        if even, divide by 2
//        else times by 3 and add 1

public class Main {
    static NumberFormat formatter = new DecimalFormat("0.######E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
    public static BigInteger collatz(BigInteger number) {
        BigInteger counter = BigInteger.ZERO;
        while (number.compareTo(BigInteger.ONE) > 0) {
            counter = counter.add(BigInteger.ONE);
            if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                number = number.divide(BigInteger.TWO);
            } else {
                number = number.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE).divide(BigInteger.TWO);
            }
            String resultFormatted = formatter.format(number);
            System.out.println(resultFormatted);
        }

        return counter;
    }

    public static void main(String[] args) {
        BigInteger userInput = BigInteger.valueOf(2).pow(1000).subtract(BigInteger.ONE);

        String resultFormatted = formatter.format(userInput);
        System.out.printf("%s had %d steps%n", resultFormatted, collatz(userInput));
    }
}
