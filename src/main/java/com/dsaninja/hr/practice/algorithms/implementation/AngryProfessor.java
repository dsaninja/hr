package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/angry-professor/problem
 */
public class AngryProfessor{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int testCases = scanner.nextInt();

            for(int i = 0; i < testCases; i++){
                int studentCount = scanner.nextInt();
                int threshold = scanner.nextInt();
                int presentStudents = 0;

                for(int j = 0; j < studentCount; j++){
                    if(scanner.nextInt() <= 0){
                        presentStudents++;
                    }
                }
                if(presentStudents >= threshold){
                    System.out.println("NO");
                } else{
                    System.out.println("YES");
                }
            }
        }
    }
}
