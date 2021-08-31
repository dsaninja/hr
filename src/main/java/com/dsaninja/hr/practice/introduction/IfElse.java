package com.dsaninja.hr.practice.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-if-else/problem
 */
public class IfElse{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if(n % 2 != 0){
            System.out.println("Weird");
        } else{
            if(n >= 2 && n <= 5){
                System.out.println("Not Weird");
            } else if(n >= 6 && n <= 20){
                System.out.println("Weird");
            } else if(n > 20){
                System.out.println("Not Weird");
            }
        }
    }
}
