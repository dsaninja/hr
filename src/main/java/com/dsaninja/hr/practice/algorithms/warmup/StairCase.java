package com.dsaninja.hr.practice.algorithms.warmup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class StairCase{

    public static void main(String[] args) throws IOException{
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            print(n);
        }
    }

    private static void print(int n){
        for(int i = 0; i < n; i++){
            String ip = "#".repeat(i+1);
            System.out.printf("%" + n + "s%n", ip);
        }
    }
}
