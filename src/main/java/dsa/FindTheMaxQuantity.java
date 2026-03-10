package main.java.dsa;/*
Problem:
---------
Given an array of strings where each element contains a product name and quantity
(e.g., "xyz 10"), calculate the total quantity for each product and print the
product with the maximum total quantity.

Example Input:
--------------
{"xyz 10", "abc 9", "xyz 20"}

Expected Output:
----------------
xyz:30
The maximum of product xyz is 30


Approach:
---------
1. Iterate through the input array.
2. Split each string into product name and quantity.
3. Store the aggregated quantity for each product using a HashMap.
4. Traverse the HashMap to find the product with the maximum quantity.

Time Complexity:
----------------
O(n)

Space Complexity:
-----------------
O(n)
*/

import java.util.HashMap;
import java.util.Map;

class FindTheMaxQuantity {

    public static void main(String[] args) {

        String[] a = {"xyz 10", "abc 9", "xyz 20"};

        // HashMap to store product and total quantity
        HashMap<String, Integer> dataMap = new HashMap<>();

        // Step 1: Aggregate quantities
        for (String data : a) {

            String[] dataArray = data.split(" ");

            String name = dataArray[0];
            int value = Integer.parseInt(dataArray[1]);

            dataMap.put(name, dataMap.getOrDefault(name, 0) + value);
        }

        System.out.println("Aggregated Data: " + dataMap);

        // Step 2: Find product with maximum quantity
        int max = 0;
        String result = "";

        for (Map.Entry<String, Integer> entryData : dataMap.entrySet()) {

            if (max < entryData.getValue()) {

                max = entryData.getValue();
                result = entryData.getKey();
            }
        }

        // Step 3: Print result
        System.out.println("The maximum of product " + result + " is " + max);
    }
}