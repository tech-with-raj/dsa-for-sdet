package main.java.dsa;

import java.util.Arrays;

public class RearrangeOddAndEvenInArray {

    public static void main(String[] args) {

        // Problem:
        // 1. Move all even numbers to the beginning of the array
        // 2. Move all odd numbers to the end
        // 3. Sort even and odd sections separately

        int[] input = {2, 0, 6, 7, 3, 0, 1, 4, 6, 8, 9};

        System.out.println("Original Array: " + Arrays.toString(input));

        int left = 0;
        int right = input.length - 1;

        // Step 1: Partition array using two-pointer technique
        while (left < right) {

            while (left < right && input[left] % 2 == 0) {
                left++;
            }

            while (left < right && input[right] % 2 != 0) {
                right--;
            }

            if (left < right) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;

                left++;
                right--;
            }
        }

        // Step 2: Find boundary of even section
        int evenPartitionEnd = 0;

        while (evenPartitionEnd < input.length && input[evenPartitionEnd] % 2 == 0) {
            evenPartitionEnd++;
        }

        // Step 3: Sort even part and odd part separately
        Arrays.sort(input, 0, evenPartitionEnd);
        Arrays.sort(input, evenPartitionEnd, input.length);

        System.out.println("Final Output:   " + Arrays.toString(input));
    }


}
