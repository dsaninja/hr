package com.dsaninja.hr.practice.java.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-dequeue/problem
 */
public class JavaDequeue{
    public static void main(String[] args){
        Map<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = 0;

        for(int i = 0; i < n; i++){
            if(i >= m){
                int old = deque.removeFirst();
                if(map.get(old) == 1){
                    map.remove(old);
                } else{
                    map.merge(old, -1, Integer::sum);
                }
            }

            int num = scan.nextInt();
            deque.addLast(num);
            map.merge(num, 1, Integer::sum);

            max = Math.max(max, map.size());

            if(max == m){
                break;
            }
        }

        scan.close();
        System.out.println(max);
    }
}
