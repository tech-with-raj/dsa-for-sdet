package main.java.dsa;

public class FindMissingNumberInArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 5, 6};

        int totalnumber = 6;

        // sum of total no
        int actualSum = (totalnumber * (totalnumber + 1)) / 2;

        // calculating array sum
        int sum = 0;

        for (int i = 0; i <= a.length - 1; i++) {

            sum = sum + a[i];
        }

        int missedNumber = actualSum - sum;
        System.out.println("Missing number is " + missedNumber);


    }

}
