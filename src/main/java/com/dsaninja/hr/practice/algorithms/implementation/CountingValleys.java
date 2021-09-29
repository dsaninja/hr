package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem
 */
public class CountingValleys{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int steps = scanner.nextInt();
            String path = scanner.next();

            int level = 0;
            int valleys = 0;
            for(char step : path.toCharArray()){
                // if down decrement the level
                if(step == 'D'){
                    level--;
                } else{
                    // else, increment the level and as the valley can only complete
                    // from -ve to 0; check if its level 0
                    // in that case increment valleys
                    level++;
                    if(level == 0){
                        valleys++;
                    }
                }
            }

            System.out.println(valleys);
        }
    }
}
