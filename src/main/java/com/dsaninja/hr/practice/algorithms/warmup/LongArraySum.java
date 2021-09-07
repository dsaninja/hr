package com.dsaninja.hr.practice.algorithms.warmup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class LongArraySum{
    public static void main(String[] args) throws IOException{
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))){

            List<Long> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Long::parseLong)
                    .collect(toList());

            long result = Result.aVeryBigSum(ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
    }

    private static class Result{
        public static long aVeryBigSum(List<Long> ar){
            return ar.stream().reduce(Long::sum).get();
        }

    }
}
