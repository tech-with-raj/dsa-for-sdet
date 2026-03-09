package main.java.dsa;

/*
Problem: Find Unique Elements in an Array

Description:
Given an integer array, print the elements that appear only once in the array.

Example:
Input  : {1, 2, 3, 1, 2}
Output : 3

Explanation:
1 appears twice
2 appears twice
3 appears only once → Unique element

Approach:
1. Traverse the array using two loops.
2. For each element, count how many times it appears in the array.
3. If the count equals 1, it is a unique element.

Time Complexity  : O(n²)
Space Complexity : O(1)
*/

public class FindUniqueElements2 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 2};

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println("Unique Elements: " +arr[i]);
            }
        }
    }
}