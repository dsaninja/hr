package com.dsaninja.hr.practice.java.datastructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-arraylist/problem
 */
public class JavaArrayList{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int rowCount = scan.nextInt();

        // Save numbers in 2-D ArrayList
        List<List<Integer>> twoDimList = new ArrayList<>();
        for(int row = 0; row < rowCount; row++){
            int numberOfEntries = scan.nextInt();
            List<Integer> list = new ArrayList<>();
            for(int col = 0; col < numberOfEntries; col++){
                list.add(scan.nextInt());
            }
            twoDimList.add(list);
        }

        // answer the queries
        int queryCount = scan.nextInt();
        for(int i = 0; i < queryCount; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            List<Integer> list = twoDimList.get(x - 1);
            if(y <= list.size()){
                System.out.println(list.get(y - 1));
            } else{
                System.out.println("ERROR!");
            }
        }

        scan.close();
    }
}
