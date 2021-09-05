package com.dsaninja.hr.practice.java.exceptions;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-exception-handling/problem
 */
public class ExceptionHandling{
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        while(in.hasNextInt()){
            int n = in.nextInt();
            int p = in.nextInt();

            try{
                System.out.println(my_calculator.power(n, p));
            } catch(Exception e){
                System.out.println(e);
            }
        }
    }

    private static class MyCalculator{
        public static int power(int n, int p) throws Exception{
            if(n == 0 && p == 0){
                throw new Exception("n and p should not be zero.");
            }
            if(n < 0 || p < 0){
                throw new Exception("n or p should not be negative.");
            } else{
                return ((int) Math.pow(n, p));
            }
        }
    }
}
