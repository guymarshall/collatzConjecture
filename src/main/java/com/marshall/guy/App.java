package com.marshall.guy;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

// if even, divide by 2
// else times by 3 and add 1

public class App 
{
    static NumberFormat formatter = new DecimalFormat("0.######E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
    public static BigInteger collatz(BigInteger number)
    {
        BigInteger counter = BigInteger.ZERO;
        while (number.compareTo(BigInteger.ONE) > 0)
        {
            counter = counter.add(BigInteger.ONE);
            if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO))
            {
                number = number.divide(BigInteger.TWO);
            }
            else
            {
                number = number.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE).divide(BigInteger.TWO);
            }
        }

        return counter;
    }

    public static void main(String[] args)
    {
        BigInteger userInput = BigInteger.valueOf(2).pow(1000000).subtract(BigInteger.ONE);
        // 2^200000 - 1 = 9.980052E60205 had 1728481 steps
        // 2^1000000 - 1 = 9.900656E301029 has 8615753 steps

        String resultFormatted = formatter.format(userInput);
        System.out.printf("%s had %d steps%n", resultFormatted, collatz(userInput));
    }
}
