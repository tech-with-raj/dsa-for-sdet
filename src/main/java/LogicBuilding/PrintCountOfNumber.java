package main.java.LogicBuilding;

public class PrintCountOfNumber {


    public static void main(String[] args) {

        int number = 1234;
        int count = 0;
        int lastDigit;

        while (number != 0) {
            lastDigit = number % 10;
            count++;
            number = number / 10;
        }

        System.out.println("Total number of digit in the given number is "+count);

    }

}
