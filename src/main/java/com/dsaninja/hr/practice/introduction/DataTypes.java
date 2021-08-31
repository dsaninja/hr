package com.dsaninja.hr.practice.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-datatypes/problem
 */
public class DataTypes{
    public static void main(String[] argh){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++){
            try{
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if(x >= -128 && x <= 127) System.out.println("* byte");
                if(x >= -32_768 && x <= 32_767) System.out.println("* short");
                if(x >= -2_14_74_83_648 && x <= 2_14_74_83_647) System.out.println("* int");
                System.out.println("* long");
            } catch(Exception e){
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
