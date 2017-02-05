package com.thoughtworks.tw101.exercises.exercise6;

/**
 * Created by Kayla on 1/31/2017.
 */
public class Troll implements Monster{
    int hitPoints = 40;
    final String name = "Troll";

    @Override
    public void takeDamage(int amount) {
        hitPoints -= amount / 2;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + " " + hitPoints);
    }
}
