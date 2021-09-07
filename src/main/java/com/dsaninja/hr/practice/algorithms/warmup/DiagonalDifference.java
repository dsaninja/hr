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

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference{
    public static void main(String[] args) throws IOException{
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")))){

            int n = Integer.parseInt(bufferedReader.readLine().trim());
            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, n).forEach(i -> {
                try{
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch(IOException ex){
                    throw new RuntimeException(ex);
                }
            });

            int result = Result.diagonalDifference(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }
    }

    private static class Result {
        public static int diagonalDifference(List<List<Integer>> input) {
            int ltr = 0;
            int rtl = 0;

            int length = input.size();
            for(int i = 0; i < length; i++){
                int j = length  - i - 1;

                ltr = ltr + input.get(i).get(i);
                rtl = rtl + input.get(i).get(j);
            }

            return Math.abs(ltr - rtl);

        }

    }
}
