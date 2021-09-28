package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/drawing-book/problem
 */
public class DrawingBook{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int totalPage = scanner.nextInt();
            int targetPage = scanner.nextInt();

            System.out.println(calculatePageTurns(totalPage, targetPage));
        }
    }

    private static int calculatePageTurns(int totalPage, int targetPage){
        // as there are 2 printed pages per page
        // turns from left to target page -> targetPage/2
        // turns from left to last page -> totalPage/2
        // turns from last page to target page -> totalPage/2 - targetPage/2
        return Math.min(targetPage/2, totalPage/2 - targetPage/2);
    }
}
