package com.dsaninja.hr.practice.java.oops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-instanceof-keyword/problem
 */
public class InstanceOf{
    public static void main(String[] args){
        List<Object> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 0; i < t; i++){
            String s = sc.next();
            if(s.equals("Student")) list.add(new Student());
            if(s.equals("Rockstar")) list.add(new Rockstar());
            if(s.equals("Hacker")) list.add(new Hacker());
        }
        System.out.println(count(list));
    }

    static String count(List<?> list){
        int a = 0, b = 0, c = 0;
        for(Object element : list){
            if(element instanceof Student)
                a++;
            if(element instanceof Rockstar)
                b++;
            if(element instanceof Hacker)
                c++;
        }
        return a + " " + b + " " + c;
    }

    private static class Student{}
    private static class Rockstar{}
    private static class Hacker{}
}
