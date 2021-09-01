package com.dsaninja.hr.practice.java.bignumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * https://www.hackerrank.com/challenges/java-primality-test/problem
 */
public class JavaPrimalityTest{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        bufferedReader.close();
        System.out.println(new BigInteger(n).isProbablePrime(1) ? "prime" : "not prime");
    }
}
