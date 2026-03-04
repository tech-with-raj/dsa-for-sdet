package main.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueElements {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 1, 2};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : numbers) {

            // If add() returns false, it means element already exists
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        // Remove duplicate elements from seen set
        seen.removeAll(duplicates);

//        System.out.println("Unique Elements: " + seen);

        System.out.println("Unique Elements: " + seen.iterator().next());


    }
}