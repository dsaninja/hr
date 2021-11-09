package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/permutation-equation/problem
 */
public class SequenceEquation {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();

            // p(x) is a one-to-one function, so it has an inverse.
            // We create the function representing the inverse of p(x),
            // and represent it as an array: int [] inverseFunction

            //We need to find a y where p(p(y)) = x. This equation can be
            // rewritten as y = inverseFunction(inverseFunction(x)), which is
            // the version of the equation we will use to calculate and print y.

            int[] inverseFunction = new int[count + 1];

            for (int i = 1; i <= count; i++) {
                int val = scanner.nextInt();
                inverseFunction[val] = i;
            }

            for (int i = 1; i <= count; i++) {
                System.out.println(inverseFunction[inverseFunction[i]]);
            }
        }
    }
}
