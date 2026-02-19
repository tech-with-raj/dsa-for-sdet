package main.java.dsa;

import java.util.HashSet;

/**
 * Problem:
 * --------
 * Given a string, find the length of the longest substring
 * without repeating characters.
 *
 * Example:
 * Input  : "abcabcab"
 * Output : 3
 *
 * Explanation:
 * The longest non-repeating substrings are:
 * "abc", "bca", "cab"
 *
 * Approach:
 * ----------
 * Sliding Window + HashSet
 *
 * - Use two pointers (left and right) to represent the current window.
 * - Expand the window by moving right.
 * - If a duplicate character appears, shrink the window from the left.
 * - Track the maximum window size.
 *
 * Time Complexity:
 * ----------------
 * O(n) because each character is added and removed at most once.
 *
 * Space Complexity:
 * -----------------
 * O(k), where k is the number of unique characters in the window.
 */
public class LongestNonRepeatingSubstring {

    public static void main(String[] args) {

        String input = "abcabcab";

        HashSet<Character> uniqueCharacters = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        // Sliding Window Technique
        for (int right = 0; right < input.length(); right++) {

            char currentChar = input.charAt(right);

            // Remove characters until the current one becomes unique
            while (uniqueCharacters.contains(currentChar)) {
                uniqueCharacters.remove(input.charAt(left));
                left++;
            }

            // Add current character into the set
            uniqueCharacters.add(currentChar);

            // Update maximum length found so far
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Input String: " + input);
        System.out.println("Longest Non-Repeating Substring Length: " + maxLength);
    }
}
