package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        final int INT_TO_GENERATE_PRIME_FACTOR_FOR = 30;
        List<Integer> primeFactors = generate(INT_TO_GENERATE_PRIME_FACTOR_FOR);
        System.out.println("Prime factors for " + INT_TO_GENERATE_PRIME_FACTOR_FOR + ": ");
        for(Integer primeFactor : primeFactors){
            System.out.println(primeFactor);
        }
    }

    private static List<Integer> generate(int n) {
        final int FIRST_PRIME_NUM = 2;
        List<Integer> primeNumList = new ArrayList<Integer>();

        for(int i = FIRST_PRIME_NUM; i <= n; ++i){
            if(n % i == 0) {
                primeNumList.add(i);
                n /= i;
            }
        }

        return primeNumList;
    }
}
