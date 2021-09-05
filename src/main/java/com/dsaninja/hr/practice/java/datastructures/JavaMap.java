package com.dsaninja.hr.practice.java.datastructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/phone-book/problem
 */
public class JavaMap{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        Map<String, String> phoneBook = new HashMap<>(n);
        while(2 * n-- > 0){
            phoneBook.put(scanner.nextLine().trim().toLowerCase(), scanner.nextLine());
        }

        while(scanner.hasNext()){
            String name = scanner.nextLine().trim().toLowerCase();
            if(phoneBook.containsKey(name)){
                System.out.println(name + "=" + phoneBook.get(name));
            }else{
                System.out.println("Not found");
            }

        }
    }
}
