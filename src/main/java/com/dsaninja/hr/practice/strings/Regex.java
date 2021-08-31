package com.dsaninja.hr.practice.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-regex/problem
 */
public class Regex{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new IpAddressRegexPattern().pattern));
        }

    }
}

//Write your code here
class IpAddressRegexPattern{
    String zeroTo255
            = "(\\d{1,2}|(0|1)\\"
            + "d{2}|2[0-4]\\d|25[0-5])";
    String pattern = zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255 + "\\."
            + zeroTo255;
}
