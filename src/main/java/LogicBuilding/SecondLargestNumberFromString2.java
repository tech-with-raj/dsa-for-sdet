package main.java.LogicBuilding;

import java.util.TreeSet;

public class SecondLargestNumberFromString2 {

    public static void main(String[] args) {

        String input = "abc1232";

        char[] charArray = input.toCharArray();

        TreeSet<Integer> set = new TreeSet<>();

        for (char ch : charArray) {

            if (Character.isDigit(ch)) {

                int currentdigit = ch - '0';

                set.add(currentdigit);

            }


        }

        int largest = set.last();
        int secondLargest = set.lower(largest);

        System.out.println("Largest number in the String is " + largest);
        System.out.println("Second largest number in the String is " + secondLargest);

    }


}
