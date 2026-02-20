package main.java.dsa;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Problem Statement:
 * Given a string, remove duplicate characters while preserving insertion order.
 * Return the result as a String.
 * <p>
 * Example:
 * Input  : abbacdaab
 * Output : abcd
 * <p>
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 */
public class RemoveDuplicateCharactersToString {

    public static void main(String[] args) {

        String input = "abbacdaab";

        String result = removeDuplicates(input);

        System.out.println("Input String  : " + input);
        System.out.println("Result String : " + result);
    }

    /**
     * Removes duplicate characters and returns result as String.
     *
     * @param input input string
     * @return string with unique characters in insertion order
     */
    public static String removeDuplicates(String input) {

        Set<Character> set = new LinkedHashSet<>();

        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (set.add(ch)) {

                result.append(ch);
            }
        }

        return result.toString();
    }
}