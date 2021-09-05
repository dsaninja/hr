package com.dsaninja.hr.practice.java.datastructures;

import java.util.BitSet;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-bitset/problem
 */
public class JavaBitSet{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        scanner.nextLine();
        BitSet[] sets = new BitSet[2];
        sets[0] = new BitSet(n);
        sets[1] = new BitSet(n);

        while(m-- > 0){
            String operation = scanner.next();
            int operandOne = scanner.nextInt();
            int operandTwo = scanner.nextInt();

            switch(operation){
                case "AND" -> sets[operandOne - 1].and(sets[operandTwo - 1]);
                case "OR" -> sets[operandOne - 1].or(sets[operandTwo - 1]);
                case "XOR" -> sets[operandOne - 1].xor(sets[operandTwo - 1]);
                case "FLIP" -> sets[operandOne - 1].flip(operandTwo);
                case "SET" -> sets[operandOne - 1].set(operandTwo);
            }

            System.out.println(sets[0].cardinality() + " " + sets[1].cardinality());
        }
    }
}
