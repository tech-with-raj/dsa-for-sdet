package main.java.dsa;

import java.util.Arrays;

public class ReverseAnArraySolution2 {

    public static void main(String[] args) {

        int[] input = {17, 38, 48, 90, 45, 65};

        int left = 0;
        int right = input.length - 1;

        int temp;

        while (right > left) {

            temp = input[left];
            input[left] = input[right];
            input[right] = temp;
            right--;
            left++;
        }

        System.out.println(Arrays.toString(input));
    }
}
