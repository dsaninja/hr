package com.dsaninja.hr.practice.java.datastructures;

import java.util.Scanner;
import java.util.Stack;

/**
 * A string containing only parentheses is balanced if the following is true: 1.
 * if it is an empty string 2. if A and B are correct, AB is correct, 3.
 * if A is correct, (A) and {A} and [A] are also correct.
 * <p>
 * Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"
 * Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.
 * Given a string, determine if it is balanced or not.
 * <p>
 * Input Format:
 * There will be multiple lines in the input file, each having a single non-empty string. You should read input
 * till end-of-file.
 * <p>
 * Output Format:
 * For each case, print 'true' if the string is balanced, 'false' otherwise.
 * <p>
 * https://www.hackerrank.com/challenges/java-stack/problem
 */
public class JavaStack{
    private static final Stack<Character> stack = new Stack<>();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String input = scanner.nextLine();
            System.out.println(validateBraces(input));
        }
    }

    private static boolean validateBraces(String input){
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else if(stack.isEmpty()){
                return false;
            } else{
                char popped = stack.pop();
                if(!((ch == ')' && popped == '(') ||
                        (ch == '}' && popped == '{') ||
                        (ch == ']' && popped == '['))){
                    return false;
                }
            }
        }

        boolean result = stack.isEmpty();
        stack.clear();
        return result;
    }
}
