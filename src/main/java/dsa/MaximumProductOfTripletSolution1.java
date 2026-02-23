package main.java.dsa;

import java.util.Arrays;

/*
 * Problem: Maximum Product of Triplet
 *
 * Description:
 * Given an integer array, find the maximum product of any three numbers.
 *
 * Approach:
 * 1. Sort the array.
 * 2. Compare:
 *    - Product of three largest numbers
 *    - Product of two smallest numbers and the largest number
 * 3. Return the maximum of the two.
 *
 * Time Complexity: O(n log n)
 * Space Complexity: O(1)
 */

public class MaximumProductOfTripletSolution1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, -20, -10, 3, 4};

        int result = maxProductOfTriplet(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Maximum Product of Triplet: " + result);
    }

    public static int maxProductOfTriplet(int[] arr) {

        if (arr == null || arr.length < 3) {
            throw new IllegalArgumentException(
                    "Array must contain at least three elements");
        }

        Arrays.sort(arr);
        int n = arr.length;

        int productLargest = arr[n - 1] * arr[n - 2] * arr[n - 3];
        int productWithNegatives = arr[0] * arr[1] * arr[n - 1];

        return Math.max(productLargest, productWithNegatives);
    }
}