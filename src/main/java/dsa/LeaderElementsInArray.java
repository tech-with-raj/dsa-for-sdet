package main.java.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Problem Statement:
 * -------------------
 * Given an integer array, find all the **leader elements**.
 *
 * A leader element is an element that is greater than
 * all the elements to its right side.
 *
 * The rightmost element is always considered a leader.
 *
 * Example:
 * Input  : {16, 17, 4, 3, 5, 2}
 * Output : Leaders = {17, 5, 2}
 *
 * Explanation:
 * - 2 is a leader because it is the last element.
 * - 5 is a leader because all elements to its right are smaller (2).
 * - 17 is a leader because all elements to its right are smaller.
 *
 * Approach:
 * ----------
 * - Traverse the array from right to left.
 * - Maintain the maximum element seen so far.
 * - If the current element is greater than the max, it is a leader.
 *
 * Time Complexity:
 * ----------------
 * O(n)  (Single reverse traversal)
 *
 * Space Complexity:
 * -----------------
 * O(k)  (To store leader elements)
 */

public class LeaderElementsInArray {

    public static void main(String[] args) {

        int[] arr = {16, 17, 4, 3, 5, 2};

        List<Integer> leaders = new ArrayList<>();

        // Step 1: Rightmost element is always a leader
        int maxFromRight = arr[arr.length - 1];
        leaders.add(maxFromRight);

        // Step 2: Traverse from right to left
        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                leaders.add(arr[i]);
            }
        }

        // Output 1: Leaders in reverse traversal order (Right to Left)
        System.out.println("Leaders (Reverse Order): " + leaders);

        // Output 2: Leaders in correct order (Left to Right)
        Collections.reverse(leaders);
        System.out.println("Leaders (Correct Order): " + leaders);
    }
}
