package com.thoughtworks.tw101.introductory_programming_exercises;

//FizzBuzz Exercise
//        FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to
//        certain rules.
//
//        Create a fizzBuzz() method that prints out the numbers 1 through 100.
//        Instead of numbers divisible by three print "Fizz".
//        Instead of numbers divisible by five print "Buzz".
//        Instead of numbers divisible by three and five print "FizzBuzz".
//
//        Sample Output:
//        1
//        2
//        Fizz
//        4
//        Buzz
//        Fizz
//        7
//        8
//        Fizz
//        Buzz
//        11
//        Fizz
//        13
//        14
//        FizzBuzz

public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz();
    }

    private static void fizzBuzz() {
        final int MIN_NUM_IN_RANGE = 1,
                  MAX_NUM_IN_RANGE = 100,
                  NUM_DIV_FOR_FIZZ = 3,
                  NUM_DIV_FOR_BUZZ = 5;

        for(int i = MIN_NUM_IN_RANGE; i <= MAX_NUM_IN_RANGE; ++i){
            if(i % NUM_DIV_FOR_FIZZ == 0 && i % NUM_DIV_FOR_BUZZ == 0){
                System.out.println("FizzBuzz");
            }
            else if(i % NUM_DIV_FOR_FIZZ == 0){
                System.out.println("Fizz");
            }
            else if(i % NUM_DIV_FOR_BUZZ == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }
}
