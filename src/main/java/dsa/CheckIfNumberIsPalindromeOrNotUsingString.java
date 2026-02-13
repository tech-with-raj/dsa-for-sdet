package main.java.dsa;

public class CheckIfNumberIsPalindromeOrNotUsingString {

    public static void main(String[] args) {

        int number = 1276551;

//        I am going to convert int to String
        String numberInString = Integer.toString(number); // Integer is Wrapper class which help us to convert Primitive datatype to Non primitive datatype
        String numberInString2 = number + ""; // If we add any number to empty string, it will be become in string format

        StringBuilder reverseOfStringBuilder = new StringBuilder(numberInString);
        String reveredNum = reverseOfStringBuilder.reverse().toString();

        // comparing two strings
        if (numberInString.equals(reveredNum)) {

            System.out.println(number + " is Palindrome");
        } else {

            System.out.println(number + " is not Palindrome");

        }

    }
}
