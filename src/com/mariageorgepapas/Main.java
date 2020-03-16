package com.mariageorgepapas;

public class Main {

    public static void main(String[] args) {

        // Create a byte variable and set it to any valid byte number
        byte byteNumber = 10;
        // Create a short variable and set it to any valid short number
        short shortNumber = 232;
        // Create an int variable and set it to any valid int number
        int intNumber = 2845;
        // Create a variable type long and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values
        long totalLongNumber = 50000L + 10L * (byteNumber + shortNumber +intNumber);
        System.out.println(totalLongNumber);
        // Create a variable type short and make it equal to 1000 plus 10 times the sum of the byte plus the short plus the integer values
        short totalShortNumber = (short) (1000 + 10 * (byteNumber + shortNumber + intNumber));
        System.out.println(totalShortNumber);

        // while creating the short total variable we are casting because java would read the new number as an int
    }
}
