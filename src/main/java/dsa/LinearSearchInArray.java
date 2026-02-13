package main.java.dsa;

public class LinearSearchInArray {

    public static void main(String[] args) {

        int[] input = {10, 3, 56, 45, 50};
        int key = 3;  // try a value not in the array

        boolean found = false; // flag to track if element exists

        for (int index = 0; index < input.length; index++) {

            if (key == input[index]) {
                System.out.println("Element found at index " + index);
                found = true; // mark as found
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found in array");
        }
    }
}
