package com.dsaninja.hr.practice.algorithms.implementation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudents{
    public static void main(String[] args) throws IOException{
        try(Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt();
            List<Integer> grades = new ArrayList<>(n);

            for(int i = 0; i < n; i++){
                grades.add(scanner.nextInt());
            }

            gradingStudents(grades).forEach(System.out::println);
        }
    }

    private static List<Integer> gradingStudents(List<Integer> grades) {
        for(int i = 0, gradesSize = grades.size(); i < gradesSize; i++){
            Integer grade = grades.get(i);
            if(grade >= 38){
                int deltaToNextMultipleOfFive = 5 - (grade % 5);
                if(deltaToNextMultipleOfFive < 3){
                    grades.set(i, grade + deltaToNextMultipleOfFive);
                }
            }
        }

        return grades;

    }

}
