package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem
 */
public class DayOfProgrammer{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            String result = null;
            int year = scanner.nextInt();
            if (year < 1918) {
                result = year%4==0 ? "12.09."+year : "13.09."+year;
            } else if (year == 1918) {
                result = "26.09."+year;
            } else {
                result = (year % 4 == 0 && year % 100 != 0)|| year%400 == 0 ? "12.09."+year : "13.09."+year;
            }

            System.out.println(result);
        }
    }
}
