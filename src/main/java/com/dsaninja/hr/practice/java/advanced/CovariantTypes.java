package com.dsaninja.hr.practice.java.advanced;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/challenges/java-covariance/problem
 */

public class CovariantTypes {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();

        Region region = switch(s){
            case "WestBengal" -> new WestBengal();
            case "AndhraPradesh" -> new AndhraPradesh();
            default -> null;
        };

        Flower flower = region.yourNationalFlower();
        System.out.println(flower.whatsYourName());
    }
}

class Flower {
    String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower{
    String whatsYourName(){
        return "Lily";
    }
}

abstract class Region {
    abstract Flower yourNationalFlower();
}

class WestBengal extends Region{
    Flower yourNationalFlower(){
        return new Jasmine();
    }
}

class AndhraPradesh extends Region{
    Flower yourNationalFlower(){
        return new Lily();
    }
}
