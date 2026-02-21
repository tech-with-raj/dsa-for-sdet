package main.java.dsa;

import java.util.Arrays;

/**
 * Problem: Rotate Array to the Left by K Positions
 *
 * Example:
 * Input:  [1, 2, 3, 4, 5], k = 2
 * Output: [3, 4, 5, 1, 2]
 *
 * Approach:
 * 1. Reverse first k elements
 * 2. Reverse remaining elements
 * 3. Reverse entire array
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class RotateArrayLeft {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};
        int k = 2;

        k = k % a.length;

        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        reverse(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

    static void reverse(int[] a, int left, int right) {

        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }

}