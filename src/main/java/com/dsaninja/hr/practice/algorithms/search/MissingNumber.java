package com.dsaninja.hr.practice.algorithms.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/missing-numbers/problem
 */
public class MissingNumber{

    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> arr = new ArrayList<>(n);

        for(int i = 0; i < n; i++){
            arr.add(scan.nextInt());
        }

        int m = scan.nextInt();
        List<Integer> brr = new ArrayList<>(m);
        for(int i = 0; i < m; i++){
            brr.add(scan.nextInt());
        }

        List<Integer> integers = missingNumbers(arr, brr);
        System.out.println(integers);
    }

    // implemented solution : starts
    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr){
        // as the difference between maximum and minimum element is less than equal to 100
        // we can keep a frequency array of size 101 as taking a modulus with 101 wil always
        // give us a unique reminder between 0..100
        int[] freq = new int[101];

        // the divisor array is used to re-calculate the original value
        // after the modulo operation
        int[] divisor = new int[101];

        // increment freq for each item in brr
        brr.forEach(item -> freq[item % 101]++);
        // populate quotient value for each item/101 to re-calculate the value
        brr.forEach(item -> divisor[item % 101] = item / 101);
        // decrement the frequency for each item in arr
        arr.forEach(item -> freq[item % 101]--);

        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < 101; i++){
            if(freq[i] != 0){
                // re-calculate the value
                // dividend = quotient * 101 + remainder
                // here reminder is the current index as its frequency
                // is denoted by freq array
                result.add(divisor[i] * 101 + i);
            }
        }

        return result;
    }
    // implemented solution : ends
}