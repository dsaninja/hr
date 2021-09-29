package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class ElectronicsShop{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int budget = scanner.nextInt();
            int keyboardCount = scanner.nextInt();
            int drivesCount = scanner.nextInt();

            int[] keyboardCost = new int[keyboardCount];
            int[] driveCost = new int[drivesCount];


            for(int i = 0; i < keyboardCount; i++){
                keyboardCost[i] = scanner.nextInt();
            }

            for(int i = 0; i < drivesCount; i++){
                driveCost[i] = scanner.nextInt();
            }

            System.out.println(moneySpent(keyboardCost, driveCost, budget));
        }
    }

    private static int moneySpent(int[] keyboardCost, int[] driveCost, int budget){
        Arrays.sort(keyboardCost);
        Arrays.sort(driveCost);
        System.out.println("sorted");

        int maxAmountSpent = -1;

        int minIndex = 0;
        int maxIndex = driveCost.length - 1;

        while(minIndex < keyboardCost.length && maxIndex >= 0){
            int sum = keyboardCost[minIndex] + driveCost[maxIndex];

            if(sum > budget){
                maxIndex--;
            } else{
                if(sum > maxAmountSpent){
                    maxAmountSpent = sum;
                }
                minIndex++;
            }
        }

        return maxAmountSpent;
    }
}
