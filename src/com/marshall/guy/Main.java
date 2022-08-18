package com.marshall.guy;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    //implement collatz function using int (for performance)
    public static BigInteger collatz_bigint(BigInteger number) {
        BigInteger counter = BigInteger.ZERO;
//        if even, divide by 2
//        else times by 3 and add 1
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

        System.out.println("Do you want to calculate:");
        System.out.println("1 - Maximum number of steps for a range up to the input");
        System.out.println("2 - Number of steps and maximum number reached for the input");
        System.out.print("Enter your choice (1 OR 2): ");
        int choice = scanner.nextInt();

//        System.out.print("Enter a positive integer: ");
//        BigInteger userInput = scanner.nextBigInteger();
//
//        BigInteger maxNumber = BigInteger.ZERO;
//        BigInteger maxSteps = BigInteger.ZERO;
//
//        BigInteger counter = BigInteger.ONE;
//        for (; counter.compareTo(userInput) <= 0; counter = counter.add(BigInteger.ONE)) {
//            if (maxSteps.compareTo(collatz(counter)) < 0) {
//                maxSteps = collatz(counter);
//                maxNumber = counter;
//            }
//        }
//
//        System.out.printf("%d had the maximum number of steps at %d", maxNumber, maxSteps);

        //if userInput is above maybe 100000 (need to check), use bigint function (slower, but has the size required)

        switch (choice) {
            case 1:
                //do loop through numbers up to range and do collatz on those
                break;
            case 2:
                //do collatz for number entered and return number of steps and max number reached
                break;
            default:
                System.out.println("Invalid option. Please try again.");
                System.exit(0);
        }
    }
}
