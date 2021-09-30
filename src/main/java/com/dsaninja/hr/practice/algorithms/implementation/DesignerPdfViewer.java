package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
 */
public class DesignerPdfViewer{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int [] heights = new int[26];
            for(int i = 0; i < 26; i++){
                heights[i] = scanner.nextInt();
            }

            String input = scanner.next();
            int maxHeight = Integer.MIN_VALUE;
            for(char character : input.toCharArray()){
                if(maxHeight < heights[character - 'a']){
                    maxHeight = heights[character - 'a'];
                }
            }

            System.out.println(maxHeight * input.length());
        }
    }
}
