package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int timesIncremented = 0;

    void increment(){
        ++timesIncremented;
    }

    void total(){
        System.out.println(timesIncremented);
    }
}
