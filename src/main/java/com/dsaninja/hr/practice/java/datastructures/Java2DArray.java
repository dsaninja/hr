package com.dsaninja.hr.practice.java.datastructures;

import java.io.IOException;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-2d-array/problem
 */
public class Java2DArray{
    public static void main(String[] args) throws IOException{
        //Input
        Scanner sc = new Scanner(System.in);
        int[][] ip = new int[6][6];
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                ip[i][j] = sc.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                int sum = ip[i][j] + ip[i][j + 1] + ip[i][j + 2] + ip[i + 1][j + 1] + ip[i + 2][j] + ip[i + 2][j + 1] + ip[i + 2][j + 2];
                if(max < sum){
                    max = sum;
                }
            }
        }

        System.out.println(max);
    }
}
