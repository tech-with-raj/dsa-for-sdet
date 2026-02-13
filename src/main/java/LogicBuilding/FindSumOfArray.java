package main.java.dsa;

public class FindSumOfArray {

    public static void main(String[] args) {

        int[] nums = {1, 45, 34, 53, 43};

        int sumOfArray = 0;

        //Using for each loop
        for (int n : nums) {

            sumOfArray = sumOfArray + n;
        }

        System.out.println(sumOfArray);
        sumOfArray = 0;

        
        for (int i = 0; i <= (nums.length) - 1; i++) {

            sumOfArray = sumOfArray + nums[i];

        }

        System.out.println(sumOfArray);

    }

}
