package com.dsaninja.hr.practice.algorithms.warmup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class Triplets{
    public static void main(String[] args) throws IOException{
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))){

            List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> result = Result.compareTriplets(a, b);

            bufferedWriter.write(
                    result.stream()
                            .map(Object::toString)
                            .collect(joining(" "))
                            + "\n"
            );
        }
    }

    private static class Result{
        public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
            List<Integer> scores = new ArrayList<>(2);
            scores.add(0);
            scores.add(0);

            IntStream.range(0,3).forEach(index -> {
                if(a.get(index) > b.get(index)){
                    scores.set(0, scores.get(0) + 1);
                } else if(a.get(index) < b.get(index)){
                    scores.set(1, scores.get(1) + 1);
                }
            });

            return scores;
        }

    }
}
