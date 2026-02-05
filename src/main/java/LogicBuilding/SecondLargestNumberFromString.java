package main.java.LogicBuilding;

public class SecondLargestNumberFromString {

    public static void main(String[] args) {

        String input = "abc1234";

        char[] charArray = input.toCharArray();

        int largest = -1;
        int secondLargest = -1;

        for (char ch : charArray) {

            if (Character.isDigit(ch)) {

                int currentdigit = ch - '0';

                if (currentdigit > largest) {

                    secondLargest = largest;

                    largest = currentdigit;

                }else if (currentdigit > secondLargest && currentdigit < largest) {

                    secondLargest = currentdigit;

                }

            }


        }

        System.out.println("Largest number in the String is "+largest);
        System.out.println("Second largest number in the String is "+secondLargest);

    }


}
