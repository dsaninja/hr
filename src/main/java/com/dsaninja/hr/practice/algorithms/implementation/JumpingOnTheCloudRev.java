package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
 */
public class JumpingOnTheCloudRev{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int numberOfCloud = scanner.nextInt();
            int jumpSize = scanner.nextInt();

            int[] clouds = new int[numberOfCloud];

            for(int i = 0; i < numberOfCloud; i++){
                clouds[i] = scanner.nextInt();
            }

            int energy = 100;
            int index = 0;
            do{
                energy--;
                index = (index + jumpSize) % numberOfCloud;
                if(clouds[index] == 1){
                    energy -= 2;
                }
            } while(index != 0);

            System.out.println(energy);
        }
    }
}
