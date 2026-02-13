package main.java.dsa;

public class OddOrEven {

    public static void main(String[] args) {

        int number = 22;

        if ((number % 2) == 0) {

            System.out.println("This is even number");
        } else {

            System.out.println("This is odd number");
        }

        int nameLength = lengthOfString();

        if ((nameLength % 2) == 0) {

            System.out.println("This is even number length string");
        } else {

            System.out.println("This is odd number length string");
        }

    }


    public static int lengthOfString() {

        String name = "Rajasekar";
        int nameLength = name.length();
        System.out.println("Length of "+name+" is "+nameLength);
        return nameLength;

    }
}
