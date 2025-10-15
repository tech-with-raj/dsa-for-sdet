package main.java.LogicBuilding;

public class FirstAndLastOccurrenceOfChar {

    public static void main(String[] args) {

        String input = "Hello World";
        char targetChar = 'o';
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == targetChar) {

                firstIndex = i;
                break;

            }

        }

        for (int i = input.length() - 1; i >= 0; i--) {

            if (input.charAt(i) == targetChar) {

                secondIndex = i;
                break;

            }

        }

        if (firstIndex < 0) {

            System.out.println("Targeted Character is not present");

        } else {

            System.out.println("First Occurrence index of " + targetChar + " is " + firstIndex);
            System.out.println("Second Occurrence index of " + targetChar + " is " + secondIndex);
        }
    }
}
