package com.dsaninja.hr.practice.java.advanced;

/**
 * https://www.hackerrank.com/challenges/java-singleton/problem
 */
public class JavaSingleton{
    public static void main(String[] args){
        Singleton singleton = Singleton.getSingleInstance();
    }

    private static class Singleton{
        public String str;
        private Singleton(){}
        private static final Singleton INSTANCE = new Singleton();
        public static Singleton getSingleInstance(){
            return INSTANCE;
        }
    }
}
