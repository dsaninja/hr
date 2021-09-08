package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
public class AppleAndOrange{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int s = scanner.nextInt();
            int t = scanner.nextInt();

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            int m = scanner.nextInt();
            int n = scanner.nextInt();

            int[] apples = new int[m];
            int[] oranges = new int[n];

            for(int i = 0; i < m; i++){
                apples[i] = scanner.nextInt();
            }

            for(int i = 0; i < n; i++){
                oranges[i] = scanner.nextInt();
            }

            countApplesAndOranges(s,t,a,b,apples, oranges);
        }
    }

    private static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int appleCount = 0;
        int orangeCount = 0;

        for(int apple : apples){
            if(apple + a >= s && apple + a <= t){
                appleCount++;
            }
        }

        for(int orange : oranges){
            if(orange + b <= t && orange + b >= s){
                orangeCount++;
            }
        }

        System.out.println(appleCount);
        System.out.println(orangeCount);
    }

}
