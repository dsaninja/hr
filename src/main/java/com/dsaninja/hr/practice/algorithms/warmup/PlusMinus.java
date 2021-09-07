package com.dsaninja.hr.practice.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class PlusMinus{

    public static void main(String[] args) throws IOException{
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            Result.plusMinus(arr);
        }
    }

    private static class Result{
        public static void plusMinus(List<Integer> arr){
            int plus = 0;
            int minus = 0;
            int zero = 0;

            for(Integer element : arr){
                if(element < 0){
                    minus++;
                } else if(element == 0){
                    zero++;
                } else{
                    plus++;
                }
            }

            int size = arr.size();
            DecimalFormat df = new DecimalFormat("#.000");

            System.out.printf("%.6f %n", (double) plus / size);
            System.out.printf("%.6f %n", (double) minus / size);
            System.out.printf("%.6f %n", (double) zero / size);
        }

    }
}
