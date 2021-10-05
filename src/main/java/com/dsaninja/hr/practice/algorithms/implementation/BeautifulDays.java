package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
public class BeautifulDays{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(in)){
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            int divisor = scanner.nextInt();

            int count = 0;

            for(int i = start; i <= end; i++){
                if(Math.abs(i - reverse(i)) % divisor == 0){
                    count++;
                }
            }

            System.out.println(count);
        }
    }

    private static int reverse(int number){
        int result = 0;
        while(number > 0){
            int rem = number % 10;
            result = result*10 + rem;
            number = number/10;
        }

        return result;
    }
}
