package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/circular-array-rotation/problem
 */
public class CircularArrayRotation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int arraySize = scanner.nextInt();
            int rotationCount = scanner.nextInt();
            int queries = scanner.nextInt();

            int[] input = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                input[i] = scanner.nextInt();
            }

            rotate(input, rotationCount);
            while (queries-- > 0){
                int index = scanner.nextInt();
                System.out.println(input[index]);
            }
        }
    }

    private static void rotate(int[] input, int rotationCount) {
        int length = input.length;
        rotationCount %= length; // to account for rotationCount > size

        swap(input, 0, length - 1); // reverse entire array
        swap(input, 0, rotationCount - 1); // reverse first rc elements
        swap(input, rotationCount, length - 1); // reverse last set

    }

    private static void swap(int[] input, int start, int end){
        while (start < end){
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;

            start++;
            end--;
        }
    }
}
