package com.thoughtworks.tw101.exercises.exercise6;

// Exercise #6: Create Orc and Troll classes that implement a Monster interface with takeDamage(int amount),
// reportStatus methods. Create instances of both classes and store them in an ArrayList.
// Iterate through the list and make each monster take 10 points of damage. After you have damaged all of the monsters,
// report the status of all monsters using a void reportStatus() method. ReportStatus should print the NAME and current hit
// points of the monster.
// * Orcs are named “Orc” and have 20 initial hitpoints
// * Trolls are named “Troll”, have 40 hit points and only take half damage

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Monster orc = new Orc(),
                troll = new Troll();

        ArrayList<Monster> monsterList = new ArrayList<>(Arrays.asList(orc, troll));

        for(Monster aMonster : monsterList){
            aMonster.takeDamage(10);
        }

        for(Monster aMonster : monsterList){
            aMonster.reportStatus();
        }

    }
}
