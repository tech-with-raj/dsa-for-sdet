package main.java.dsa;

/*
    🔸 Question: Two Sum
    Problem Statement:

    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

    You may assume that each input would have exactly one solution, and you may not use the same element twice.

    You can return the answer in any order.

🔹 Example:
    text
            Copy
    Edit
    Input: nums = [2, 7, 11, 15], target = 9
    Output: [0, 1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    🔸 Follow-up:
    Can you come up with an algorithm that has O(n) time complexity?

 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] num, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {

            int complement = target - num[i];

            if (map.containsKey(complement)) {

                return new int[]{map.get(complement), i};
            }
            map.put(num[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] arg) {

        int[] num = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(num, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }

}

/*
🧠 Line-by-Line Explanation
java
Copy
Edit
import java.util.HashMap;
import java.util.Map;
🔹 Imports the HashMap and Map classes from Java’s standard library.
We use a HashMap to store numbers and their indices for quick lookup (O(1) average time).

java
Copy
Edit
public class TwoSumSolution {
🔹 Declares a public class named TwoSumSolution.

java
Copy
Edit
    public static int[] twoSum(int[] nums, int target) {
🔹 Declares a static method twoSum that:

Takes an integer array nums and an integer target as inputs.

Returns an integer array of size 2 (the indices of the two numbers that add up to target).

java
Copy
Edit
        Map<Integer, Integer> map = new HashMap<>();
🔹 Initializes a HashMap:

Key: number from the array

Value: its index
🧠 This helps us find if the complement (target - nums[i]) exists in O(1) time.

java
Copy
Edit
        for (int i = 0; i < nums.length; i++) {
🔹 Starts a loop through the array nums from index 0 to the last index.

java
Copy
Edit
            int complement = target - nums[i];
🔹 Calculates the complement:

If we want two numbers to add up to target, and one number is nums[i], the other must be target - nums[i].

java
Copy
Edit
            if (map.containsKey(complement)) {
🔹 Checks if the complement already exists in the HashMap.

If yes, that means we've already seen a number which, with nums[i], adds up to the target.

java
Copy
Edit
                return new int[] { map.get(complement), i };
🔹 If the complement exists:

We return the pair of indices: one from the map (complement's index), and the current index i.

java
Copy
Edit
            }
🔹 Ends the if-block.

java
Copy
Edit
            map.put(nums[i], i);
🔹 If complement not found, we add the current number and its index to the map for future use.

java
Copy
Edit
        }
🔹 Ends the for-loop.

java
Copy
Edit
        throw new IllegalArgumentException("No two sum solution");
🔹 If no such pair is found in the array (shouldn’t happen if input is valid), we throw an exception.

🔽 main method
java
Copy
Edit
    public static void main(String[] args) {
🔹 Entry point of the program.

java
Copy
Edit
        int[] nums = {2, 7, 11, 15};
        int target = 9;
🔹 Sample input array and target.

java
Copy
Edit
        int[] result = twoSum(nums, target);
🔹 Calls the twoSum method and stores the result (indices of numbers that sum up to target).

java
Copy
Edit
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
🔹 Prints the indices of the two numbers found.

✅ Output:
makefile
Copy
Edit
Indices: [0, 1]
Because nums[0] + nums[1] = 2 + 7 = 9

 */
