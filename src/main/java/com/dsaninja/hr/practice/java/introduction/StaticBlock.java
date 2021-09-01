package com.dsaninja.hr.practice.java.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 */
public class StaticBlock{
    private static boolean flag = true;
    private static final int B;
    private static final int H;

    static{
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        if(B <= 0 || H <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area = B * H;
            System.out.print(area);
        }

    }
}
