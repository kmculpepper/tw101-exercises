package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    private int timesIncremented = 0;

    void increment(){
        ++timesIncremented;
    }

    void total(){
        System.out.println(timesIncremented);
    }
}
