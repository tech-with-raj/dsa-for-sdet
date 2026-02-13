package main.java.dsa;

public class CheckMonotonicArray {

    public static void main(String[] args) {

        int[] a = {2, 3, 6, 8, 9};

        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < a.length; i++) {

            if (a[i - 1] < a[i]) {

                decreasing = false;

            } else if (a[i - 1] > a[i]) {

                increasing = false;
            }

        }

        if (increasing || decreasing) {

            System.out.println("The given array is Monotonic");

        } else {

            System.out.println("The given array is not Monotonic");

        }

    }
}
