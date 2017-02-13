package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        Guess aGuess = new Guess(new BufferedReader(new InputStreamReader(System.in)),
                                    System.out, System.err, 1, 100);

        while(!aGuess.isRight()) {
            aGuess.guess();
        }
        aGuess.printGuesses();
    }
}
