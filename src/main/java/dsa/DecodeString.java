package main.java.dsa;

    import java.util.*;

/*
Problem Statement:
------------------
You are given an encoded string where each character is followed by a digit
representing how many times that character should be repeated.

Write a program to decode the string and print the expanded result.

Example:
Input:
d3e4w2j1b5n0

Explanation:
d3 → d repeated 3 times → ddd
e4 → e repeated 4 times → eeee
w2 → w repeated 2 times → ww
j1 → j repeated 1 time  → j
b5 → b repeated 5 times → bbbbb
n0 → n repeated 0 times → (nothing)

Output:
dddeeeewwjbbbbb
*/

    public class DecodeString {

        public static void main(String[] args) {

            String input = "d3e4w2j1b5n0";

            char[] inputArray = input.toCharArray();
            StringBuilder decodedString = new StringBuilder();

            for (int i = 0; i < inputArray.length; i = i + 2) {

                char letter = inputArray[i];
                int count = inputArray[i + 1] - '0';

                for (int j = 0; j < count; j++) {
                    decodedString.append(letter);
                }
            }

            System.out.println(decodedString.toString());
        }
    }

