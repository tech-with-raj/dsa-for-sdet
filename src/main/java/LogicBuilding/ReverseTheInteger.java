package main.java.dsa;

public class ReverseTheInteger {


    public static void main(String[] arg) {

        int number = 2340;
        int reversedNumber = 0;
        int lastDigit;

        while (number != 0) {

            lastDigit = number % 10;

            // Check for overflow
//            if (reversedNumber > Integer.MAX_VALUE / 10 || (reversedNumber == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
//                System.out.println(0);
//                System.exit(0);
//            }
//
//            if (reversedNumber < Integer.MIN_VALUE / 10 || (reversedNumber == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
//                System.out.println(0);
//                System.exit(0); // Underflow, return 0
//            }

            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;

        }
        System.out.println("Reversed Number is:"+reversedNumber);
    }
}






