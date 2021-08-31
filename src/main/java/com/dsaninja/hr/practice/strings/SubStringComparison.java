package com.dsaninja.hr.practice.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-compare/problem
 */
public class SubStringComparison{
    public static String getSmallestAndLargest(String s, int k){
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.List<String> subStrings = new java.util.ArrayList<>();
        for(int i = 0; i <= s.length() - k; i++){
            subStrings.add(s.substring(i, i + k));
        }
        java.util.Collections.sort(subStrings);
        smallest = subStrings.get(0);
        largest = subStrings.get(subStrings.size() - 1);
        return smallest + "\n" + largest;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
