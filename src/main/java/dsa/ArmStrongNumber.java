package main.java.dsa;

public class ArmStrongNumber {

    public static void main(String[] arg) {

        // What is Armstrong number
        // sum of cube of each digit in the number give same number then it's Arm strong number
        int number = 153;
        int lastDigit;
        int copy = number;
        int armStrong = 0;

        while (copy != 0) {

            lastDigit = copy % 10;
            copy = copy / 10;
            armStrong = armStrong + (lastDigit * lastDigit * lastDigit);
        }

        if (number == armStrong) {
            System.out.println("Given number " + number + " is Armstrong");
        } else {

            System.out.println("Given number " + number + " is not Armstrong");
        }


    }
}
