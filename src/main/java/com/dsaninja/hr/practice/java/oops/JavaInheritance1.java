package com.dsaninja.hr.practice.java.oops;

/**
 * https://www.hackerrank.com/challenges/java-inheritance-1/problem
 */
public class JavaInheritance1{
    public static void main(String[] args){
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }

    private static class Animal{
        void walk(){
            System.out.println("I am walking");
        }
    }

    private static class Bird extends Animal{
        void fly(){
            System.out.println("I am flying");
        }
        void sing(){
            System.out.println("I am singing");
        }
    }

}


