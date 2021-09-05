package com.dsaninja.hr.practice.java.oops;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-abstract-class/problem
 */
public class JavaAbstractClass{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();
    }

    private static abstract class Book{
        String title;
        abstract void setTitle(String s);

        String getTitle(){
            return title;
        }
    }

    static class MyBook extends Book{
        @Override
        void setTitle(String s){
            this.title = s;
        }
    }
}