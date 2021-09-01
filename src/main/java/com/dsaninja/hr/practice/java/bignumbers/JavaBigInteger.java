package com.dsaninja.hr.practice.java.bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-biginteger/problem
 */
public class JavaBigInteger{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        BigInteger one = new BigInteger(sc.nextLine().trim());
        BigInteger two = new BigInteger(sc.nextLine().trim());

        sc.close();

        System.out.println(one.add(two));
        System.out.println(one.multiply(two));
    }
}
