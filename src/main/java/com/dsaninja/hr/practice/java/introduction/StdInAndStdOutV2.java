package com.dsaninja.hr.practice.java.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-stdin-stdout/problem
 */
public class StdInAndStdOutV2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
