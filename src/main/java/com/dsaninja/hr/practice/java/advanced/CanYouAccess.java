package com.dsaninja.hr.practice.java.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/can-you-access/problem
 */
public class CanYouAccess{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        Object o;
        System.out.println(num + " is " + ((Inner.Private) (o = new Inner().new Private())).powerof2(num));
        System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
    }

    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }
}