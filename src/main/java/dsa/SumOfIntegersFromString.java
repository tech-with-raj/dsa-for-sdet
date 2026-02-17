package main.java.dsa;

/**
 * Program: Sum of Integers in a String

 * This program extracts all integers from a given sentence
 * and calculates their total sum.

 * Example Input:
 * "Room 101 is ready for guest 502..."

 * Output:
 * Sum of all integers = 88568
 */

public class SumOfIntegersFromString {

    public static void main(String[] args) {

        String input =
                "Room 101 is ready for guest 502, staying for 3 nights, " +
                        "check-in at 12 PM, checkout on day 4, booking ID 78945, " +
                        "and service request 9001 is confirmed.";

        // Split the sentence into individual words
        String[] words = input.split(" ");

        int sum = 0;

        // Traverse each word and extract numeric values
        for (String word : words) {

            // Remove all non-digit characters (commas, letters, symbols, etc.)
            word = word.replaceAll("[^0-9]", "");

            // Convert and add only if the word contains a valid number
            if (!word.isEmpty()) {
                try {
                    int number = Integer.parseInt(word);

                    //Print extracted numbers
                    System.out.println("Found number: " + number);

                    sum += number;

                } catch (NumberFormatException e) {
                    // Ignore invalid numeric conversions
                }
            }
        }

        // Print final result
        System.out.println("\nSum of all integers = " + sum);
    }
}

