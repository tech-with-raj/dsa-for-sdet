package main.java.dsa;

/**
 * Problem:
 * Find the maximum product of any triplet in the array.
 *
 * Approach:
 * The maximum product can come from:
 * 1. Product of the three largest numbers
 * 2. Product of two smallest (negative) numbers and the largest number
 *
 * Example:
 * Input: [1, 2, -20, -10, 3, 4]
 * Output: 800  (-20 * -10 * 4)
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class MaximumProductOfTripletSolution2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, -20, -10, 3, 4};
        int result = maxProductOfTriplet(arr);
        System.out.println("Maximum Product of Triplet: " + result);
    }

    /**
     * Returns the maximum product of any triplet in the array.
     */
    public static int maxProductOfTriplet(int[] arr) {

        // Edge case validation
        if (arr == null || arr.length < 3) {
            throw new IllegalArgumentException(
                    "Array must contain at least three elements");
        }

        // Track three largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        // Track two smallest numbers (for negative case)
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int number : arr) {

            // Update largest numbers
            if (number > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = number;

            } else if (number > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = number;

            } else if (number > thirdLargest) {
                thirdLargest = number;
            }

            // Update smallest numbers
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;

            } else if (number < secondSmallest) {
                secondSmallest = number;
            }
        }

        int productLargest = largest * secondLargest * thirdLargest;
        int productWithNegatives = smallest * secondSmallest * largest;

        return Math.max(productLargest, productWithNegatives);
    }
}