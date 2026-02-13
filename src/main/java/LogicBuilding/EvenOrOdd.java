package main.java.dsa;

public class EvenOrOdd {

    public static void main(String[] arg) {

        int num = 32;

        if ((num % 2) == 1) {

            System.out.println("This number is Odd number");
        } else {

            System.out.println("This number is Even number");

        }

        // Using logical operator

        if ((num & 1) == 1) {

            System.out.println("This number is Odd number");
        } else {

            System.out.println("This number is Even number");

        }

    }

}
