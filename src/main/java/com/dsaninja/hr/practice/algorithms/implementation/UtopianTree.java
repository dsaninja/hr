package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/utopian-tree/problem
 */
public class UtopianTree{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int testCases = scanner.nextInt();

            for(int i = 0; i < testCases; i++){
                int cycles = scanner.nextInt();
                int height = 0;
                for(int j = 0; j <= cycles; j++){
                    if(j % 2 == 0){
                        height += 1;
                    } else{
                        height *= 2;
                    }
                }

                System.out.println(height);
            }
        }
    }
}
