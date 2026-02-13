package main.java.dsa;

import java.util.ArrayList;


public class EvenOrOddFromArrayList {


    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add(24);
        arrayList.add("Raj");
        arrayList.add(23);
        arrayList.add(21.98);


        for (Object O : arrayList) {

            if (O instanceof Integer) {

                if (((Integer) O) % 2 == 0) {

                    System.out.println("Even value " + O);
                } else {

                    System.out.println("odd value " + O);

                }


            }


        }


    }


}
