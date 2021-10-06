package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 */
public class SaveThePrisoner{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int chairs = scanner.nextInt();

            while(chairs-- > 0){
                int prisonerCount = scanner.nextInt();
                int numberOfSweets = scanner.nextInt();
                int start = scanner.nextInt();

                System.out.println((((start -1) + (numberOfSweets - 1))% prisonerCount + 1));
            }
        }
    }
}
