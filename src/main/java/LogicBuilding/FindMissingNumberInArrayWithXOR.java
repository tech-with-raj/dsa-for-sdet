package main.java.dsa;

public class FindMissingNumberInArrayWithXOR {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 6};

        int missingNuber = 0;

        for (int number : a) {

            missingNuber = missingNuber ^ number;

        }

        for (int i = 0; i <= 6; i++) {

            missingNuber = missingNuber ^ i;

        }

        System.out.println("Missing number is "+missingNuber);

    }

}
