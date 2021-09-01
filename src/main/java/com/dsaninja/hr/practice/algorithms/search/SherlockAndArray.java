package com.dsaninja.hr.practice.algorithms.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/sherlock-and-array/problem
 */
public class SherlockAndArray{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();

        while(testCases-- > 0){
            int elementCount = scan.nextInt();
            List<Integer> elements = new ArrayList<>(elementCount);
            IntStream.range(0, elementCount).forEach(index -> elements.add(index, scan.nextInt()));
            String result = balancedSumsV1(elements);
            System.out.println(result);
        }
    }

    // implemented solution : starts
    // time complexity: O(n)
    // space complexity: O(1)
    private static String balancedSumsV1(List<Integer> arr){
        if(arr.size() <= 1){
            return "YES";
        }

        // sum of array
        int sum = arr.stream().mapToInt(value -> value).sum();
        int left = 0;

        // for every value
        for(int currentValue: arr){
            // calculate right
            int right = sum - currentValue - left;

            // check if left == right
            if(left == right){
                return "YES";
            }

            // else add current value to left
            left = left + currentValue;
        }
        return "NO";
    }

    // implemented solution : starts
    // time complexity: O(n)
    // space complexity: O(1)
    private static String balancedSumsV2(List<Integer> arr){

        if(arr.size() <= 1){
            return "YES";
        }

        // let's denote a middle integer with y (i.e. the current index is y)
        // and both right and left side as x because there sum is same.
        // Now the equation will look like:
        // 1. x + y + x = sum of array
        // 2. 2x + y = sum
        // 3. 2x = sum - y

        int sum = arr.stream().mapToInt(value -> value).sum();
        int x = 0;

        for(Integer y : arr){
            if(2 * x == sum - y){
                return "YES";
            } else{
                x = x + y;
            }
        }
        return "NO";
    }
    // implemented solution : ends

}
