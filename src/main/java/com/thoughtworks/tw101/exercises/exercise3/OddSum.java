package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {
    public final int INCREMENT_BY = 2;

    public int of(final int STARTING_INT_VALUE, final int ENDING_INT_VALUE) {
        int total = 0;

        for(int i = STARTING_INT_VALUE; i < ENDING_INT_VALUE; i += INCREMENT_BY){
            total += i;
        }

        return total;
    }
}
