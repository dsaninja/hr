package com.dsaninja.hr.practice.java.introduction;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-date-and-time/problem
 */
public class DateTime{
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        int month = scanner.nextInt();
        int day = scanner.nextInt();
        int year = scanner.nextInt();

        String res = Result.findDay(month, day, year);
        System.out.println(res);
    }
}

class Result{

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year){
        return LocalDate.of(year, month, day).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH).toUpperCase();
    }

}
