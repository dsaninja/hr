package com.dsaninja.hr.practice.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/java-list/problem
 */
public class JavaList{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> input = new ArrayList<>(N);

        while(N-- > 0){
            input.add(scanner.nextInt());
        }

        int Q = scanner.nextInt();


        while(2*Q-- > 0){
            String operation = scanner.next();
            if(operation.equalsIgnoreCase("Insert")){
                input.add(scanner.nextInt(), scanner.nextInt());
            }else if(operation.equalsIgnoreCase("Delete")){
                input.remove(scanner.nextInt());
            }
            scanner.nextLine();
        }
        scanner.close();

        String result = input.stream().map(String::valueOf).collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
