package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        /**
         * NUM_START - the lower bound of the range we will be incrementing over
         * NUM_INCREMENT - the amount to increment over the range of numbers
         * NUM_END - the upper bound of the range we will be incrementing over
         */
        final int NUM_START = 1, NUM_INCREMENT = 2, NUM_END = 100;

        /**
         * numCurrent - the value we have currently incremented to
         * numSum - the total sum of the values we have incremented over
         */
        int numCurrent = NUM_START, numSum = 0;

        System.out.println("All odd numbers from " + NUM_START + " to " + NUM_END + ":");
        while(numCurrent < NUM_END){
            numSum += numCurrent;
            System.out.println(numCurrent);
            numCurrent += NUM_INCREMENT;
        }

        System.out.println("\nSum: " + numSum);
    }
}
