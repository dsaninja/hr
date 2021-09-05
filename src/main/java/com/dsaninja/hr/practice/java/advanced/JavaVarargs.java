package com.dsaninja.hr.practice.java.advanced;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/simple-addition-varargs/problem
 */
public class JavaVarargs{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            int n6 = Integer.parseInt(br.readLine());
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);

            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for(Method method : methods){
                if(set.contains(method.getName())){
                    overload = true;
                    break;
                }
                set.add(method.getName());
            }
            if(overload){
                throw new Exception("Overloading not allowed");
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    private static class Add{
        public void add(int... numbers){
            AtomicInteger sum = new AtomicInteger(0);
            String collect = Arrays.stream(numbers).peek(sum::addAndGet).boxed().map(String::valueOf).collect(Collectors.joining("+"));
            System.out.println(collect + "=" + sum);
        }
    }
}
