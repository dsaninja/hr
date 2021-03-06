package com.dsaninja.hr.practice.java.advanced;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/java-reflection-attributes/problem
 */
public class JavaReflectionAttributes{
    public static void main(String[] args){
        Class<Student> student = Student.class;
        Method[] methods = student.getDeclaredMethods();

        List<String> methodList = new ArrayList<>();
        for(Method method : methods){
            methodList.add(method.getName());
        }
        Collections.sort(methodList);
        for(String name : methodList){
            System.out.println(name);
        }
    }

    private static class Student{
        private String name;
        private String id;
        private String email;

        public String getName(){
            return name;
        }

        public void setId(String id){
            this.id = id;
        }

        public void setEmail(String email){
            this.email = email;
        }
    }
}
