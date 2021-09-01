package com.dsaninja.hr.practice.java.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
 */
class ReverseString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        /* Enter your code here. Print output to STDOUT. */
        int length = s.length();
        boolean palindrome = true;
        for(int i = 0; i < length / 2; i++){
            if(s.charAt(i) != s.charAt(length - i - 1)){
                palindrome = false;
                break;
            }
        }

        if(palindrome){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }
}
