package main.java.dsa;

import java.util.Stack;

public class ValidParanthesis {

    public static void main(String[] args) {

        String input = "()";

        System.out.println(checkParanthesis(input));

    }

    public static boolean checkParanthesis(String input) {

        char[] inputArray = input.toCharArray();

        Stack<Character> stack = new Stack<Character>();

        for (char current : inputArray) {

            if (current == '(') {

                stack.push(current);
            } else {

                if (stack.isEmpty()) {

                    return false;
                } else {

                    char topChar = stack.pop();
                    if (topChar != '(') {

                        return false;
                    }
                }

            }

        }
          return stack.isEmpty();
    }
}
