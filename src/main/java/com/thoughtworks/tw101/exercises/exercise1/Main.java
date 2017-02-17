package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        final int LOWER_BOUND = 1, INCREMENT_AMOUNT = 2, UPPER_BOUND = 100;

        int currentValue = LOWER_BOUND, sum = 0;

        System.out.println("All odd numbers from " + LOWER_BOUND + " to " + UPPER_BOUND + ":");
        while(currentValue < UPPER_BOUND){
            sum += currentValue;
            System.out.println(currentValue);
            currentValue += INCREMENT_AMOUNT;
        }

        System.out.println("\nSum: " + sum);
    }
}
