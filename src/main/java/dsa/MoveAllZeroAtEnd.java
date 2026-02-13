package main.java.dsa;

import java.util.Arrays;

public class MoveAllZeroAtEnd {

    public static void main(String[] args) {

        int[] a = {1, 0, 2, 3, 0, 5, 0, 9};
        int nonZeroValueIndex = 0;
        int temp;

        for (int currentIndex = 0; currentIndex <= a.length - 1; currentIndex++) {

            if (a[currentIndex] != 0) {

                temp = a[nonZeroValueIndex];
                a[nonZeroValueIndex] = a[currentIndex];
                a[currentIndex] = temp;
                nonZeroValueIndex++;

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
