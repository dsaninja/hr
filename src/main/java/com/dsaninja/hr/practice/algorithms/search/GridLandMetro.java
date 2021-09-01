package com.dsaninja.hr.practice.algorithms.search;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * https://www.hackerrank.com/challenges/gridland-metro/problem
 */
public class GridLandMetro{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
        int n = Integer.parseInt(firstMultipleInput[0]);
        int m = Integer.parseInt(firstMultipleInput[1]);
        int k = Integer.parseInt(firstMultipleInput[2]);

        List<List<Integer>> track = new ArrayList<>();
        IntStream.range(0, k).forEach(i -> {
            try{
                track.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch(IOException ex){
                throw new RuntimeException(ex);
            }
        });

        long result = gridLandMetro(n, m, k, track);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    public static long gridLandMetro(long n, long m, long k, List<List<Integer>> tracks){
        // for case where there are no tracks
        // simply return m*n
        if(k == 0){
            return n * m;
        }

        // create a row and tracks mapping
        // the key is the row number and value is a list of tracks
        // where each track in itself is represented as a list of two entries (start and end)
        Map<Long, List<List<Long>>> rowAndTracks = new HashMap<>();

        // for each track in the current test case
        for(List<Integer> track : tracks){

            // fetch the track start, end and row number
            long row = track.get(0);
            long start = track.get(1);
            long end = track.get(2);

            // check if we have already visited this row
            if(rowAndTracks.containsKey(row)){
                // fetch the existing row
                List<List<Long>> existingRow = rowAndTracks.get(row);

                // for all the tracks in current row
                for(List<Long> existingTrack : existingRow){

                    // check existing start and end
                    Long existingStart = existingTrack.get(0);
                    Long existingEnd = existingTrack.get(1);

                    // the current track finish before existing track
                    // or starts after existing track
                    if(end < existingStart || start > existingEnd){
                        // current track either finishes before the existing track
                        // or starts after the existing track
                        rowAndTracks.get(row).add(createTrack(start, end));
                        break;
                    } else{
                        // current track starts before existing track so update existing track's start
                        if(start < existingStart){
                            existingTrack.set(0, start);
                        }
                        // current track ends after existing track so update existing track's end
                        if(end > existingEnd){
                            existingTrack.set(1, end);
                        }
                    }
                }
            } else{
                // visited first time
                // create a new list containing the track
                rowAndTracks.computeIfAbsent(row, rowNum -> new ArrayList<>()).add(createTrack(start, end));
            }

        }

        long sum = 0;
        for(long index : rowAndTracks.keySet()){
            List<List<Long>> rowTracks = rowAndTracks.get(index);
            for(List<Long> track : rowTracks){
                // add up the total covered cells
                sum += track.get(1) - track.get(0) + 1;
            }
        }

        // return total grid size- populated tracks
        return m * n - sum;

    }

    private static List<Long> createTrack(long start, long end){
        List<Long> track = new ArrayList<>();
        track.add(start);
        track.add(end);

        return track;
    }
}
