package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem
 */
public class SockMerchant{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int numberOfSocks = scanner.nextInt();
            // another option is to use a hashset
            int[] sockFrequency = new int[101];
            Arrays.fill(sockFrequency, Integer.MIN_VALUE);

            for(int i = 0; i < numberOfSocks; i++){
                int index = scanner.nextInt();
                if(sockFrequency[index] == Integer.MIN_VALUE){
                    sockFrequency[index] = 1;
                }else{
                    sockFrequency[index]++;
                }
            }

            int pairs = 0;
            for(int i = 0; i < 101; i++){
                if(sockFrequency[i] != Integer.MIN_VALUE){
                    pairs += sockFrequency[i]/2;
                }
            }

            System.out.println(pairs);
        }
    }
}
