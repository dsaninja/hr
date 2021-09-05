package com.dsaninja.hr.practice.java.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem
 */
public class TryCatch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            System.out.println(x / y);
        } catch(ArithmeticException | InputMismatchException e){
            if(e instanceof ArithmeticException){
                System.out.println("java.lang.ArithmeticException: / by zero");
            } else if(e instanceof InputMismatchException){
                System.out.println("java.util.InputMismatchException");
            }
        }
        scanner.close();
    }
}
