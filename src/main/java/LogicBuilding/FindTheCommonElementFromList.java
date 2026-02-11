package main.java.LogicBuilding;

import java.util.ArrayList;

public class FindTheCommonElementFromList {


    public static void main(String[] args){

        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");

        ArrayList<String> list2 = new ArrayList<>();

        list2.add("a");
        list2.add("b");
        list2.add("d");
        list2.add("e");

        list1.retainAll(list2);

        System.out.println(list1);

    }

}
