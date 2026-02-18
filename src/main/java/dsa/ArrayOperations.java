package main.java.dsa;

import java.util.Arrays;

/**
 * Problem Statement:
 * -------------------
 * Given an integer array, perform the following operations:
 * <p>
 * 1. Calculate the total sum of all elements.
 * 2. Find the largest and second largest elements.
 * 3. Reverse only the first half of the array.
 * <p>
 * Example:
 * Input  : {4, 5, 10, 3, 7}
 * <p>
 * Output :
 * Sum of elements            = 29
 * Largest element            = 10
 * Second largest element     = 7
 * Array after first-half reverse = {5, 4, 10, 3, 7}
 * <p>
 * Concepts Used:
 * --------------
 * - Array Traversal
 * - Finding Maximum Values
 * - In-place Swapping
 * <p>
 * Time Complexity:
 * ----------------
 * Sum Calculation        : O(n)
 * Largest & Second Largest : O(n)
 * First Half Reverse     : O(n/2)
 * <p>
 * Overall Complexity     : O(n)
 */

public class ArrayOperations {

    public static void main(String[] args) {

        int[] arr = {4, 5, 10, 3, 7};

        // 1. Sum of all elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements = " + sum);

        // 2. Largest and Second Largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest element = " + largest);
        System.out.println("Second largest element = " + secondLargest);

        // 3. Reverse the first half of the array
        int mid = arr.length / 2;
        int left = 0;
        int right = mid - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Array after first-half reverse = " + Arrays.toString(arr));
    }
}
