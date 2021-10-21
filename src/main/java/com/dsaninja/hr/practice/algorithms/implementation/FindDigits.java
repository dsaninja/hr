package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;


/**
 * https://www.hackerrank.com/challenges/find-digits/problem
 */
public class FindDigits{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int testCount = scanner.nextInt();
            while(testCount-- > 0){
                int input = scanner.nextInt();
                int divisors = 0;
                int rem = input;

                while(rem > 0){
                    // rem % 10 denotes the digit from rhs to lhs
                    int currentRem = rem % 10;
                    if(currentRem != 0 && input % (currentRem) == 0){
                        divisors++;
                    }
                    // in every iteration we reduce rem by 1 unit
                    rem = rem/10;
                }

                System.out.println(divisors);
            }
        }
    }
}
