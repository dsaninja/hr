package com.dsaninja.hr.practice.java.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-tokens/problem
 */
public class Tokens{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        //CDB
        s = s.trim();
        if(s.length() > 0){
            String[] tokens = s.split("[!,?._'@\\s]+");
            System.out.println(tokens.length);
            for(String token : tokens){
                System.out.println(token);
            }
        } else{
            System.out.println(0);
        }
        scan.close();
    }
}
