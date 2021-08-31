package com.dsaninja.hr.practice.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-int-to-string/problem
 */
public class Int2String{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();

        String s = String.valueOf(n);
        if(n == Integer.parseInt(s)){
            System.out.println("Good job");
        } else{
            System.out.println("Wrong answer.");
        }
    }
}
