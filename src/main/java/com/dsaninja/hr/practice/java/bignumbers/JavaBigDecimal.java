package com.dsaninja.hr.practice.java.bignumbers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-bigdecimal/problem
 */
public class JavaBigDecimal{
    public static void main(String[] args){
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            s[i] = sc.next();
        }
        sc.close();


        Arrays.sort(s, (o1, o2) -> {
            BigDecimal one = new BigDecimal(o1);
            BigDecimal two = new BigDecimal(o2);

            return Integer.compare(0, one.compareTo(two));

        });

        for(int i = 0; i < n; i++){
            System.out.println(s[i]);
        }

    }
}
