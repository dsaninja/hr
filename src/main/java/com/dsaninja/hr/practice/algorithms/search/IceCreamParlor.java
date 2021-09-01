package com.dsaninja.hr.practice.algorithms.search;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/icecream-parlor/problem
 */
public class IceCreamParlor{
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while(testCases-- > 0){
            int moneyToSpend = scan.nextInt();
            int flavors = scan.nextInt();
            List<Integer> costs = new ArrayList<>(flavors);
            for(int i = 0; i < flavors; i++){
                costs.add(scan.nextInt());
            }

            List<Integer> flavorsBought = iceCreamParlor(moneyToSpend, costs);
            System.out.println(flavorsBought);
        }
        scan.close();
    }

    // implemented solution : starts
    // space complexity: O(n)
    // time complexity: O(n)
    public static List<Integer> iceCreamParlor(int moneyToSpend, List<Integer> costs){
        // map to hold cost and its index
        Map<Integer, Integer> costAndFlavorIndex = new HashMap<>();
        List<Integer> result = null;
        for(int i = 0; i < costs.size(); i++){
            int costOfCurrentFlavor = costs.get(i);
            int otherContribution = moneyToSpend - costOfCurrentFlavor;
            if(costAndFlavorIndex.containsKey(otherContribution)){
                // increment the index by 1 as result expects 1 based index
                // also the existing index in the map will always be lesser
                // than the current index so sorted output is maintained
                result = List.of(costAndFlavorIndex.get(otherContribution), i + 1);
                break;
            }
            costAndFlavorIndex.putIfAbsent(costOfCurrentFlavor, i + 1);
        }
        return result;
    }
    // implemented solution : ends
}
