package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Kayla on 1/31/2017.
 */
public class Orc implements Monster{
    int hitPoints = 20;
    final String name = "Orc";

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " " + hitPoints);
    }
}
