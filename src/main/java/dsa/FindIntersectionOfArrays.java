package main.java.dsa;

import java.util.*;

/*
Problem Statement:
------------------
Find the intersection of two integer arrays.

The intersection should contain only UNIQUE elements that appear in both arrays.
The result can be returned in any order.

Example:
Input:
arr1 = [1,2,2,1]
arr2 = [2,2]

Output:
[2]

Explanation:
The number 2 appears in both arrays. Since the intersection must contain
only unique elements, the result is [2].

Approach:
---------
1. Store elements of the first array in a HashSet (set1) to remove duplicates.
2. Traverse the second array.
3. If an element exists in set1, add it to another HashSet (set2).
   - set2 ensures the intersection result also contains unique elements.
4. Convert set2 into an array.
5. Print the final intersection array.

Time Complexity:
O(n + m)
n = length of arr1
m = length of arr2

Space Complexity:
O(n)
*/

class FindIntersectionOfArrays {

    public static void main(String[] args) {

        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements of arr1 into set1
        for(int num : arr1){
            set1.add(num);
        }

        // Check intersection with arr2
        for(int num : arr2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }

        System.out.println("Intersection Set: " + set2);

        // Convert Set to Array
        int[] result = new int[set2.size()];
        int index = 0;

        for(int num : set2){
            result[index] = num;
            index++;
        }

        System.out.println("Intersection Array: " + Arrays.toString(result));
    }
}