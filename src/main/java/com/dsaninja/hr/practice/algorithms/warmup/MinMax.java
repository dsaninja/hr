package com.dsaninja.hr.practice.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MinMax{
    public static void main(String[] args) throws IOException{
        List<Integer> arr;
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){

            arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            miniMaxSum(arr);
        }

    }

    private static void miniMaxSum(List<Integer> arr){
        long min = 0;
        long max = 0;

        // after sorting sum of first 4 will be minimum
        // and last 4 will be max
        Collections.sort(arr);
        for(int i = 0; i < 4; i++){
            min += arr.get(i);
        }

        for(int i = 1; i < 5; i++){
            max += arr.get(i);
        }

        System.out.println(min + " " + max);
    }
}
