package main.java.LogicBuilding;

public class MountainArrayCheck {

    public static void main(String[] args) {

        int[] a = {1, 3, 4, 5, 6, 4, 2, 1};

        if (a.length < 3) {
            System.out.println("This is not a Mountain Array");
            return;
        }

        int i = 0;

        // climb up
        while (i < a.length - 1 && a[i] < a[i + 1]) {
            i++;
        }

        // peak cannot be first or last
        if (i == 0 || i == a.length - 1) {
            System.out.println("This is not a Mountain Array");
            return;
        }

        // go down
        while (i < a.length - 1 && a[i] > a[i + 1]) {
            i++;
        }

        if (i == a.length - 1) {
            System.out.println("This is a Mountain Array");
        } else {
            System.out.println("This is not a Mountain Array");
        }
    }
}
