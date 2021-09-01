package com.dsaninja.hr.practice.java.datastructures;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-1d-array/problem
 */
public class Java1DArrayPart2{
    public static boolean canWin(int leap, int[] game){
        return canWin(0, leap, game);
    }

    private static boolean canWin(int start, int leap, int[] game){
        if(start >= game.length){
            return true;
        } else if(start < 0 || game[start] == 1){
            return false;
        }

        // to avoid endless recursion
        // mark the cell visited
        game[start] = 1;

        return canWin(start + 1, leap, game) ||
                canWin(start - 1, leap, game) ||
                canWin(start + leap, leap, game);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while(q-- > 0){
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for(int i = 0; i < n; i++){
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game)) ? "YES" : "NO");
        }
        scan.close();
    }
}