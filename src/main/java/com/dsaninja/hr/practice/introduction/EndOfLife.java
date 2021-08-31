package com.dsaninja.hr.practice.introduction;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
 */
public class EndOfLife{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;
        while(sc.hasNext()){
            System.out.println(++lineNumber + " " + sc.nextLine());
        }
    }
}
