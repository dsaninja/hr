package com.dsaninja.hr.practice.java.datastructures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-priority-queue/problem
 */
public class JavaPriorityQueue{
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args){
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while(totalEvents-- != 0){
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if(students.isEmpty()){
            System.out.println("EMPTY");
        } else{
            for(Student st : students){
                System.out.println(st.name());
            }
        }
    }

    record Student(int id, String name, double cgpa){
    }

    private static class Priorities{
        List<Student> getStudents(List<String> events){
            PriorityQueue<Student> students =
                    new PriorityQueue<>(Comparator.comparing(Student::cgpa).reversed()
                            .thenComparing(Student::name)
                            .thenComparing(Student::id));
            for(String event : events){
                // ENTER John 3.75 50
                String[] eventDetails = event.split(" ");
                String operation = eventDetails[0];

                if(operation.equals("ENTER")){
                    String name = eventDetails[1];
                    double cgpa = Double.parseDouble(eventDetails[2]);
                    int id = Integer.parseInt(eventDetails[3]);

                    Student student = new Student(id, name, cgpa);
                    students.add(student);
                } else{
                    students.poll();
                }
            }

            List<Student> result = new ArrayList<>();
            while(!students.isEmpty()){
                result.add(students.poll());
            }

            return result;
        }
    }
}


