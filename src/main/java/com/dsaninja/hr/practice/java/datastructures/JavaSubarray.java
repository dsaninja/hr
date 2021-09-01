package com.dsaninja.hr.practice.java.datastructures;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-negative-subarray/problem
 */
public class JavaSubarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int[] ip = new int[arraySize];
        for(int i = 0; i < arraySize; i++){
            ip[i] = sc.nextInt();
        }

        int count = 0;

        for(int start = 0; start < arraySize; start++){
            int temp = 0;
            for(int subArraySize = start; subArraySize < arraySize; subArraySize++){
                temp += ip[subArraySize];
                if(temp < 0){
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
