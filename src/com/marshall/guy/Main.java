package com.marshall.guy;

import java.math.BigInteger;
import java.util.Scanner;

//        if even, divide by 2
//        else times by 3 and add 1

public class Main {
    public static BigInteger collatz(BigInteger number) {
        BigInteger counter = BigInteger.ZERO;
        while (number.compareTo(BigInteger.ONE) > 0) {
            counter = counter.add(BigInteger.ONE);
            if (number.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
                number = number.divide(BigInteger.TWO);
            } else {
                number = number.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE);
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        BigInteger userInput = scanner.nextBigInteger();
        System.out.printf("%d had %d steps%n", userInput, collatz(userInput));
    }
}
