package com.dsaninja.hr.practice.java.datastructures;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-comparator/problem
 */
public class JavaComparator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, Comparator.comparing(Player::getScore).reversed().thenComparing(Player::getName));
        for(Player value : player){
            System.out.printf("%s %s\n", value.name, value.score);
        }
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public String getName(){
        return name;
    }
}