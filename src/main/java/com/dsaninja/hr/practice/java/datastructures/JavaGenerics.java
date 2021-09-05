package com.dsaninja.hr.practice.java.datastructures;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/java-generics/problem
 */
public class JavaGenerics{
    public static void main(String[] args){
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }

    public static <T> void printArray(T[] input){
        Arrays.stream(input).forEach(System.out::println);
    }
}