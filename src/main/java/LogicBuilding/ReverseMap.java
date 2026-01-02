package main.java.LogicBuilding;

import java.util.HashMap;
import java.util.Map;

public class ReverseMap {

    public static void main(String[] args) {

        Map<String, Integer> orgMap = new HashMap<String, Integer>();

        orgMap.put("A", 1);
        orgMap.put("B", 2);
        orgMap.put("C", 3);

        System.out.println(orgMap);

        Map<Integer, String> ReverseMap = new HashMap<Integer, String>();

        for (Map.Entry<String, Integer> Data : orgMap.entrySet()) {

            ReverseMap.put(Data.getValue(), Data.getKey());

        }

        System.out.println(ReverseMap);

    }
}
