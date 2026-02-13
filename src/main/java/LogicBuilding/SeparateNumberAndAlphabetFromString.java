package main.java.dsa;

public class SeparateNumberAndAlphabetFromString {

    public static void main(String[] args) {

        String input = "Ra123j";

        char[] charArray = input.toCharArray();
        StringBuilder alphabet = new StringBuilder();
        StringBuilder number = new StringBuilder();

        for (char currentChar : charArray) {

            if (Character.isDigit(currentChar)) {

                number.append(currentChar);

            } else if (Character.isAlphabetic(currentChar)) {

                alphabet.append(currentChar);
            }

        }

        System.out.println("Alphabets from String " + input + " are " + alphabet.toString());
        System.out.println("Number from String " + input + " is " + number.toString());

    }

}
