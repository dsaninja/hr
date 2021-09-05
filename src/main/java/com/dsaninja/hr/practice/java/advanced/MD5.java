package com.dsaninja.hr.practice.java.advanced;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-md5/problem
 */
public class MD5{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] digest = md5.digest(input.getBytes());
            BigInteger bigInt = new BigInteger(1,digest);
            String hashText = bigInt.toString(16);
            System.out.println(hashText);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
