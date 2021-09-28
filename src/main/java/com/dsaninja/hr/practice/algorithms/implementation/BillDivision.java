package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BillDivision{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int itemCount = scanner.nextInt();
            int itemSkipped = scanner.nextInt();

            int actualAmount = 0;

            for(int i = 0; i < itemCount; i++){
                if(i != itemSkipped){
                    actualAmount += scanner.nextInt();
                } else{
                    // ignore the item price
                    scanner.nextInt();
                }
            }

            int amountPaid = scanner.nextInt();
            int actualShare = actualAmount / 2;

            if(actualShare == amountPaid){
                System.out.println("Bon Appetit");
            } else{
                System.out.println(amountPaid - actualShare);
            }
        }
    }
}
