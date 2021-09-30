package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-hurdle-race/problem
 */
public class TheHurdleRace{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int hurdleCount = scanner.nextInt();
            int maxHeight = scanner.nextInt();

            int maxHurdleHeight = Integer.MIN_VALUE;

            for(int i = 0; i < hurdleCount; i++){
                int hurdleHeight = scanner.nextInt();
                if(maxHurdleHeight < hurdleHeight){
                    maxHurdleHeight = hurdleHeight;
                }
            }
            System.out.println(Math.max(maxHurdleHeight - maxHeight, 0));
        }
    }
}
