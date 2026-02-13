package main.java.dsa;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementsFromArray {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 2, 3, 3, 4, 5};

        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();

        for (int i : inputArray) {

            uniqueElements.add(i);
        }

        System.out.println(uniqueElements);

        // Converting Set to Array

        int[] result =uniqueElements.stream().mapToInt(Integer::intValue).toArray();

        System.out.println(Arrays.toString(result));

    }


}
