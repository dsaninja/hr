package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/append-and-delete/problem
 */
public class AppendAndDelete{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            String first = scanner.next();
            String second = scanner.next();
            int operations = scanner.nextInt();


            // Case 1: See if we can completely erase String "first" and append String "second".
            // If we need to waste operations to reach "k" operations, we can do so when String
            // "first" has no characters.
            if(first.length() + second.length() <= operations){
                System.out.println("Yes");
                return;
            }


            // Case 2: See if we can convert String "first" to String "second" without completely
            // erasing String "first". We keep erasing characters from String "first" until it becomes
            // a prefix of String "second". We then add the characters needed to turn String "first"
            // into String "second". If we need to waste operations to reach "second" operations, we
            // can only do so in groups of 2 by doing an append and a deleted.
            int i = 0; // represents index of 1st non-matching character
            for(; i < first.length() && i < second.length(); i++){
                if(first.charAt(i) != second.charAt(i)){
                    break;
                }
            }
            int minOperations = (first.length() - i) + (second.length() - i);
            // if we need to waste operations to reach k operations, we can only do so
            // in groups of 2 by doing an append and a deleted so (operations - minOperations) % 2 == 0
            System.out.println(operations >= minOperations && (operations - minOperations) % 2 == 0 ? "Yes" : "No");
        }
    }
}
