package com.dsaninja.hr.practice.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * https://www.hackerrank.com/challenges/pattern-syntax-checker/problem
 */
public class PatternChecker{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String pattern = in.nextLine();
            //slf
            try{
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch(PatternSyntaxException e){
                System.out.println("Invalid");
            }

            testCases--;
        }
    }
}
