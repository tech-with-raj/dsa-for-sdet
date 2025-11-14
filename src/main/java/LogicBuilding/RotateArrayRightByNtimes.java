package main.java.LogicBuilding;

import java.util.Arrays;

public class RotateArrayRightByNtimes {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7};

        int n = 3;  // rotate the array 3 times
        int k = n % a.length;  // handles cases where n > array length

        // Step 1: Reverse the entire array
        int left = 0;
        int right = a.length - 1;

        a = reverse(a, left, right);
        System.out.println(Arrays.toString(a));

        // Step 2: Reverse first part (0 to k-1)
        a = reverse(a, 0, k - 1);
        System.out.println(Arrays.toString(a));

        // Step 3: Reverse second part (k to end)
        a = reverse(a, k, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static int[] reverse(int[] a, int left, int right) {
        // reverse using 2–pointer approach
        int temp;
        while (left < right) {
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }
}
