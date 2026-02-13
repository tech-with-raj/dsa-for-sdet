package main.java.dsa;

public class CheckIfNumberIsPalindromeOrNot {

    public static void main(String[] args) {

        int number = 121;
        int originalNumber = number;
        int reverse = 0;

        while (number != 0) {

            int lastDigit = number % 10;

            reverse = reverse * 10 + lastDigit;

            number = number / 10;

        }

        if (originalNumber - reverse == 0) {
            System.out.println(reverse + " is a Palindrome");
        } else {
            System.out.println(reverse + " is not a Palindrome");
        }
    }

}
