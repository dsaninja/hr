package com.dsaninja.hr.practice.algorithms.search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/hackerland-radio-transmitters/problem
 */
public class RadioTransmitters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int totalHouse = scan.nextInt();
        int transmitterRange = scan.nextInt();

        List<Integer> arr = new ArrayList<>(totalHouse);
        IntStream.range(0, totalHouse).forEach(col -> {
            arr.add(scan.nextInt());
        });

        int pairs = hackerLandRadioTransmitters(arr, transmitterRange);
        System.out.println(pairs);

        scan.close();
    }

    private static int hackerLandRadioTransmitters(List<Integer> x, int k) {
        int count = 0;
        // create a freq array to represent house presence
        int[] freq = new int[1000000];
        x.forEach(value -> freq[value]++);

        int i = 0;
        while(i < freq.length) {
            // any house on index i
            if (freq[i] > 0) {
                // i will be in the range from i+k
                int potentialLocation = i + k;

                // check if there is a house on i+k i.e. potentialLocation
                if (freq[potentialLocation] > 0) {
                    // yes, put a tower here;
                    count++;
                    // this will cover i and i+k i.e. k location to left and right
                    // now move i to k+1 position to right of current tower
                    // as k position to the right will be covered by current tower
                    i = potentialLocation + k + 1;
                } else {
                    // say there is no house on i+k
                    // now move backwards towards i
                    // until a house ius found or the index becomes i
                    while (freq[potentialLocation] == 0 && potentialLocation > i) {
                        potentialLocation--;
                    }

                    // now put a tower here
                    count++;

                    // now move i to k+1 position to right of current tower
                    // as k position to the right will be covered by current tower
                    i = potentialLocation + k +1 ;
                }
            }else{
                // no house on index i
                // move to next location
                i++;
            }
        }

        return count;
    }
}
