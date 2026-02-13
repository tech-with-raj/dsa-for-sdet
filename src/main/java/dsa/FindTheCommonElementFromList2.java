package main.java.dsa;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheCommonElementFromList2 {


    public static void main(String[] args) {

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


//       Set<String> result =list1.stream().filter(x -> list2.contains(x)).collect(Collectors.toSet());

        Set<String> result = list1.stream().filter(list2::contains).collect(Collectors.toSet());


        System.out.println(result);

    }

}
