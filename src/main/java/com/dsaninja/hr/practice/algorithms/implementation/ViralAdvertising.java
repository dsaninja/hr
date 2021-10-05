package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://www.hackerrank.com/challenges/strange-advertising/problem
 */
public class ViralAdvertising{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(in)){
            int num = scanner.nextInt();
            int people = 5;
            int sum = 0;

            for(int i = 0; i < num; i++){
                people = (int) Math.floor(people/2);
                sum += people;
                people *= 3;
            }


            System.out.println(sum);
        }
    }
}
