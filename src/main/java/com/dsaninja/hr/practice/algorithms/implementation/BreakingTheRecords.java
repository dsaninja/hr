package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class BreakingTheRecords{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in);){
            int n = scanner.nextInt();
            int min = Integer.MAX_VALUE, minCount = 0, max = Integer.MIN_VALUE, maxCount = 0;
            for(int i = 0; i < n; i++){
                int temp;
                if(min > (temp = scanner.nextInt())){
                    if(min != Integer.MAX_VALUE){
                        minCount++;
                    }
                    min = temp;
                }
                if(max < temp){
                    if(max != Integer.MIN_VALUE){
                        maxCount++;
                    }
                    max = temp;
                }
            }

            System.out.println(maxCount + " " + minCount);
        }

    }
}
