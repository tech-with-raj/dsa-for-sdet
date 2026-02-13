package main.java.dsa;

import java.util.Arrays;

public class ReverseAnArraySolution1 {

    public static void main(String[] args) {

        int[] input = {17, 38, 48, 90, 45, 65};

        int[] newInput = new int[input.length];

        int indexNewInput = 0;

        for (int index = input.length - 1; index >= 0; index--) {

            newInput[indexNewInput] = input[index];
            indexNewInput++;
        }

        System.out.println(Arrays.toString(newInput));


    }
}
