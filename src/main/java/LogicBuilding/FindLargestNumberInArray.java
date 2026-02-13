package main.java.dsa;

public class FindLargestNumberInArray {


    public static void main(String[] args){

        int[] input = {10, 20, 30, 50, 60, 100};

        int largest = 0;

        for(int number : input){

            if(number > largest){

                largest = number;
            }

        }

        System.out.println(largest);

    }

}
