package main.java.dsa;

public class SecondLargestNumberInArray {

    public static void main(String[] args) {

        int[] input = {3, 4, 5, 9, 33, 23, 7};

        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for (int a : input) {

            if (a > largestNum) {

                secondLargestNum = largestNum;
                largestNum = a;

            } else if (a > secondLargestNum && a != largestNum) {

                secondLargestNum = a;
            }

        }

        System.out.println(secondLargestNum);

    }
}
