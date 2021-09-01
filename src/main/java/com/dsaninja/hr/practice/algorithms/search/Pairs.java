package com.dsaninja.hr.practice.algorithms.search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/pairs/problem
 */
public class Pairs{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int target = scan.nextInt();

        List<Integer> arr = new ArrayList<>(count);
        IntStream.range(0, count).forEach(col -> {
            arr.add(scan.nextInt());
        });
        int pairs = pairs(target, arr);
        System.out.println(pairs);

        scan.close();
    }

    public static int pairs(int k, List<Integer> arr){
        // as given arr will contain only unique values
        Set<Integer> uniqueValues = new HashSet<>(arr);

        int count = 0;
        // for every value in array
        for(int value : arr){
            // check if the set contains the difference
            if(uniqueValues.contains(value - k)){
                // if yes, increase the count
                count++;
            }
        }

        return count;
    }
}
