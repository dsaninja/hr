package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class DivisibleSumPair{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] values = new int[n];
            for(int i = 0; i < n; i++){
                values[i] = scanner.nextInt();
            }

            quadraticOrder(values, k);
            linearOrder(values, k);

        }
    }

    /**
     * In short, we need to find two numbers a and b in the array
     * such that (a+b) % k == 0.
     * <p>
     * The idea is to create a frequency array for the remainders
     * and check the presence of (k - remainder) % k in it. This is because
     * for any two values a and b in the array: <code>(a+b) % k == (a%k + b%k) % k</code>
     * <p>
     * As a%k and b%k are the remainders such that if (a+b)%k == 0
     * then a%k + b%k == k => a%k == k - b%k
     * which leads us to the point that for any remainder modeValue, if
     * (k - modValue)%k is present in the frequency array, then there is a pair
     * of numbers with sum divisible by k
     *
     * @param values the input array
     * @param k      the divisor
     */
    private static void linearOrder(int[] values, int k){
        int[] remFreq = new int[k];
        int count = 0;
        for(int value : values){
            int modValue = value % k;
            count += remFreq[(k - modValue) % k];
            remFreq[modValue]++;
        }
        System.out.println(count);
    }

    /**
     * The idea is simple, for all pairs, check if the sum
     * is divisible by k
     *
     * @param values the input array
     * @param k      the divisor
     */
    private static void quadraticOrder(int[] values, int k){
        int result = 0;
        for(int i = 0; i < values.length - 1; i++){
            for(int j = i + 1; j < values.length; j++){
                if((values[i] + values[j]) % k == 0){
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
