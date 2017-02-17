package com.thoughtworks.tw101.exercises.exercise3;

public class Main {

//    Exercise #3: Create a function 'of' in the class OddSum that returns the sum of all odd integers between a starting
//    and ending integer value.

    public static void main(String[] args) {
        OddSum oddSum = new OddSum();

        final int STARTING_INT_VALUE = 1,
                  ENDING_INT_VALUE = 100;
        Integer sum = oddSum.of(STARTING_INT_VALUE, ENDING_INT_VALUE);

        System.out.println(sum);
    }
}
