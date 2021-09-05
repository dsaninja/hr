package com.dsaninja.hr.practice.java.datastructures;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/java-hashset/problem
 */
public class JavaHashSet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        scanner.nextLine();

        Set<String> uniquePairs = new HashSet<>();


        while(testcase-- > 0){
            String pair = scanner.nextLine().trim().toLowerCase();
            uniquePairs.add(pair);
            System.out.println(uniquePairs.size());
        }
    }
}
