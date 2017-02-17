package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Kayla on 1/31/2017.
 */
public class Troll implements Monster{
    private int hitPoints = 40;
    private final String NAME = "Troll";

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount / 2;
    }

    @Override
    public void reportStatus() {
        System.out.println(NAME + " " + hitPoints);
    }
}
