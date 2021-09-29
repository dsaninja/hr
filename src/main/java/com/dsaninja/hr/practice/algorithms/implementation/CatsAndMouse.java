package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
 */
public class CatsAndMouse{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int queriesCount = scanner.nextInt();
            for(int i = 0; i < queriesCount; i++){
                int aLoc = scanner.nextInt();
                int bLoc = scanner.nextInt();
                int cLoc = scanner.nextInt();

                int aDistance = Math.abs(aLoc - cLoc);
                int bDistance = Math.abs(bLoc - cLoc);

                if(aDistance < bDistance){
                    System.out.println("Cat A");
                }else if(aDistance > bDistance){
                    System.out.println("Cat B");
                }else{
                    System.out.println("Mouse C");
                }
            }
        }
    }
}
