package com.dsaninja.hr.practice.java.advanced;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-factory/problem
 */
public class JavaFactory{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        FoodFactory foodFactory = new FoodFactory();
        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned " + food.getClass());
        System.out.println(food.getType());
    }

    private interface Food{
        String getType();
    }

    private static class Pizza implements Food{
        @Override
        public String getType(){
            return "Someone ordered a Fast Food!";
        }
    }

    private static class Cake implements Food{
        @Override
        public String getType(){
            return "Someone ordered a Dessert!";
        }
    }

    private static class FoodFactory{
        public Food getFood(String order){
            if(order.equalsIgnoreCase("Cake")){
                return new Cake();
            } else{
                return new Pizza();
            }

        }
    }
}
