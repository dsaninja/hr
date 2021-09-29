package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/picking-numbers/problem
 */
public class PickingNumbers{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int size = scanner.nextInt();
            int[] numbers = new int[size];
            for(int i = 0; i < size; i++){
                numbers[i] = scanner.nextInt();
            }

            // as the required difference is <= 1 (0 or 1)
            // we first need to consider the frequency of same elements (duplicates)
            // as only for those the difference will be 0


            // once that is done, we move to elements with difference as 1
            // those will be elements that are adjacent to each other on number line
            // or we can say i and i-1 in the frequency array

            // so in short, we need to find a pair freq[i] and freq[i-1] in the
            // such that freq[i] + freq[i-1] is maximum out of all such pairs

            int[] frequencies = new int[101];
            int result = Integer.MIN_VALUE;

            for(int i = 0; i < size; i++){
                int index = numbers[i];
                frequencies[index]++;
            }

            for(int i = 1; i <= 100; i++){
                result = Math.max(result, frequencies[i] + frequencies[i - 1]);
            }
            System.out.println(result);
        }
    }
}
