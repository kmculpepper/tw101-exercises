package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Kayla on 2/13/2017.
 */
public class Guess {
    private BufferedReader input;
    private PrintStream output,
            error;
    private boolean guessedCorrectly;
    private int minGuess,
            maxGuess;
    private int correctAnswer;
    private ArrayList<Integer> listOfGuesses;

    public Guess(BufferedReader input, PrintStream output, PrintStream error, int minGuess, int maxGuess) {
        this.input = input;
        this.output = output;
        this.error = error;
        this.minGuess = minGuess;
        this.maxGuess = maxGuess;
        guessedCorrectly = false;
        listOfGuesses = new ArrayList<>();

        //Add one to the seed and to the randomly generated integer to make the min bound exclusive
        correctAnswer = new Random().nextInt(maxGuess - minGuess + 1) + minGuess + 1;
    }

    public boolean isRight() {
        return guessedCorrectly;
    }

    public void guess() {
        output.print("Please enter your guess: ");
        try{
            int guess = Integer.parseInt(input.readLine());
            if(guess <= minGuess || maxGuess <= guess){
                error.println("When guessing, please choose a number between 1 and 100.");
            }
            else {
                listOfGuesses.add(guess);
                if (guess > correctAnswer) {
                    output.println("Too high! Please try again.");
                } else if (guess < correctAnswer) {
                    output.println("Too low! Please try again.");
                } else {
                    output.println("CORRECT! You did it!");
                    guessedCorrectly = true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch(NumberFormatException e){
            error.println(e.toString() + "\nWhen guessing, please make sure to enter an integer.");
        }
    }

    public void printGuesses() {
        output.println("List of all guesses: ");
        for(Integer guess : listOfGuesses){
            output.println(guess);
        }
    }
}