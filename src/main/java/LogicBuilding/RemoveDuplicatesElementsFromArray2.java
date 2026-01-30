package main.java.LogicBuilding;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesElementsFromArray2 {

    public static void main(String[] args) {

        int[] inputArray = {1, 2, 2, 3, 3, 4, 5};

        System.out.println(Arrays.toString(inputArray));

        inputArray = Arrays.stream(inputArray).distinct().toArray();

        System.out.println(Arrays.toString(inputArray));

    }


}
