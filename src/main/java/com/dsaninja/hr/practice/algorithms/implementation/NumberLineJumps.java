package com.dsaninja.hr.practice.algorithms.implementation;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */
public class NumberLineJumps{
    public static void main(String[] args){
        try(Scanner scanner = new Scanner(System.in)){
            int startingPointForFirstKangaroo = scanner.nextInt();
            int jumpSizeForFirstKangaroo = scanner.nextInt();
            int startingPointForSecondKangaroo = scanner.nextInt();
            int jumpSizeForSecondKangaroo = scanner.nextInt();

            // if second jumps ata higher size then two can never
            // catch up
            if(jumpSizeForSecondKangaroo < jumpSizeForFirstKangaroo){

                // as they need to meet at same point at same time
                // means they can take same number of jumps only
                // startingPointForFirstKangaroo + n * jumpSizeForFirstKangaroo == startingPointForSecondKangaroo + n * jumpSizeForSecondKangaroo
                // this gives us:
                // (startingPointForFirstKangaroo - startingPointForSecondKangaroo) % (jumpSizeForSecondKangaroo - jumpSizeForFirstKangaroo) == 0
                // for n as a whole number
                String result = ((startingPointForFirstKangaroo - startingPointForSecondKangaroo) %
                        (jumpSizeForSecondKangaroo - jumpSizeForFirstKangaroo) == 0) ?
                        "YES" :
                        "NO";
                System.out.println(result);
            } else{
                System.out.println("NO");
            }
        }
    }
}
