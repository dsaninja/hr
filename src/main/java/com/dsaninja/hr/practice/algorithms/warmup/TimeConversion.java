package com.dsaninja.hr.practice.algorithms.warmup;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion{
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            String twelveHourFormattedTime = scanner.next();

            DateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
            DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");

            System.out.println(outputFormat.format(inputFormat.parse(twelveHourFormattedTime)));
        } catch(ParseException e){
            e.printStackTrace();
        }
    }
}
