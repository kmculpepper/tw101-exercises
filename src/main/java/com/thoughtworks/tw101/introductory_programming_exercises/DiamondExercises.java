package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        int curLevel = 1;
        while(curLevel <= n){
            for(int i = curLevel; i < n; ++i){
                System.out.print(' ');
            }
            int numOfAsterisks = getNumAsterisksForLevel(curLevel);
            for(int i = 0; i < numOfAsterisks; ++i){
                System.out.print('*');
            }
            System.out.println();
            ++curLevel;
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
        int incrementBy = 1;
        int curLevel = 1;
        while(curLevel > 0){
            for(int i = curLevel; i < n; ++i){
                System.out.print(' ');
            }
            int numOfAsterisks = getNumAsterisksForLevel(curLevel);
            for(int i = 0; i < numOfAsterisks; ++i){
                System.out.print('*');
            }
            System.out.println();
            if(curLevel == n){
                incrementBy = -1;
            }
            curLevel += incrementBy;
        }

    }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        int incrementBy = 1;
        int curLevel = 1;
        while(curLevel > 0){
            if(curLevel == n){
                System.out.println("Kayla");
                incrementBy = -1;
            }
            else {
                for (int i = curLevel; i < n; ++i) {
                    System.out.print(' ');
                }
                int numOfAsterisks = getNumAsterisksForLevel(curLevel);
                for (int i = 0; i < numOfAsterisks; ++i) {
                    System.out.print('*');
                }
                System.out.println();
            }
            curLevel += incrementBy;
        }
    }

    private static int getNumAsterisksForLevel(int curLevel){
        // Number of asterisks is equal to 2x the triangle level, with the top
        // level being 1, plus one asterisk for the center
        return (curLevel - 1) * 2 + 1;
    }
}
