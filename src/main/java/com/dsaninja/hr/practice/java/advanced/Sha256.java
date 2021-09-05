package com.dsaninja.hr.practice.java.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sha-256/problem
 */
public class Sha256{
    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner input = new Scanner(System.in);
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        digest.update(input.nextLine().getBytes());

        for(byte i : digest.digest()){
            System.out.printf("%02x", i);
        }
        System.out.println();
        input.close();
    }
}
