package com.dsaninja.hr.practice.java.introduction;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * https://www.hackerrank.com/challenges/java-loops/problem
 */
public class JavaLoops{
    public static void main(String[] argh){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            process(a, b, n);
        }
        in.close();
    }

    private static void process(int a, int b, int n){
        StringJoiner joiner = new StringJoiner(" ");
        int localSum = 0;
        for(int j = 0; j < n; j++){
            localSum += Math.pow(2, j) * b;
            joiner.add(String.valueOf(a + localSum));
        }
        System.out.println(joiner);
    }
}
