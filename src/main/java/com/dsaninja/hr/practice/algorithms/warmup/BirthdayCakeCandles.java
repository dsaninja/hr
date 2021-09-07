package com.dsaninja.hr.practice.algorithms.warmup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
public class BirthdayCakeCandles{
    public static void main(String[] args) throws IOException{
        try(Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt();
            List<Integer> candles = new ArrayList<>(n);
            for(int i = 0; i < n; i++){
                candles.add(scanner.nextInt());
            }

            System.out.println(birthdayCakeCandles(candles));
        }
    }

    public static int birthdayCakeCandles(List<Integer> candles){
        int maxValue = Integer.MIN_VALUE;
        int count = 0;

        for(Integer candle : candles){
            if(candle > maxValue){
                maxValue = candle;
                count = 1;
            } else if(candle == maxValue){
                count++;
            }
        }
        return count;
    }
}
