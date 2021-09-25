package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class SubarrayDivision{
    public static void main(String[] args){
        // linearTime();
        try(Scanner scanner = new Scanner(System.in);){
            int squareCount = scanner.nextInt();
            int[] squares = new int[squareCount];

            for(int i = 0; i < squareCount; i++){
                squares[i] = scanner.nextInt();
            }

            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int result = 0;
            for(int i = 0; i <= squareCount - month; i++){
                int temp = 0;
                int index = i;
                int covered = 0;
                // calculate the sum of every sub array of length months
                while(covered < month){
                    temp = temp + squares[index++];
                    covered++;
                }

                // if the sum == day increment
                if(temp == day){
                    result++;
                }
            }

            System.out.println(result);
        }
    }

    private static void linearTime(){
        try(Scanner scanner = new Scanner(System.in);){
            int squareCount = scanner.nextInt();
            int[] squares = new int[squareCount];

            for(int i = 0; i < squareCount; i++){
                squares[i] = scanner.nextInt();
            }

            // create a sum array of size 101 as max n is 100
            int[] sum = new int[101];
            sum[0] = 0;

            int day = scanner.nextInt();
            int month = scanner.nextInt();

            for(int i = 1; i <= squareCount; i++){
                // populate sum array
                sum[i] = sum[i - 1] + squares[i-1];
            }

            int result = 0;
            for(int i = 0; i <= squareCount - month ; i++){
                // this will give us sum of length = months
                if(sum[i+month] - sum[i] == day){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
