package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem
 */
public class MigratoryBirds{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int birdCount = scanner.nextInt();
            Map<Integer, Integer> sightings = new HashMap<>();

            for(int i = 0; i < birdCount; i++){
                int birdId = scanner.nextInt();
                sightings.compute(birdId, (id, val) -> null == val ? 1 : val + 1);
            }

            int lowestId = Integer.MAX_VALUE;
            int maxSighting = Integer.MIN_VALUE;

            for(int id: sightings.keySet()){
                if(maxSighting < sightings.get(id)){
                    maxSighting = sightings.get(id);
                    lowestId = id;
                }else if(maxSighting == sightings.get(id) && lowestId > id){
                    lowestId = id;
                }
            }

            System.out.println(lowestId);

        }
    }
}
