package main.java.dsa;

public class FindLengthOfString2 {

    public static void main(String[] args) {

        String input = "Hello Rajasekar";

        int count = 0;

        while (true) {

            try {

                input.charAt(count);
                count++;

            } catch (Exception e) {

                System.out.println(count);
                break;
            }

        }


    }

}
