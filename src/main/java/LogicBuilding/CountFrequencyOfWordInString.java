package main.java.LogicBuilding;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfWordInString {

    public static void main(String[] args) {

        String input = "Hello this is Raj Raj";

        String[] wordArray = input.split(" ");

        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String word : wordArray) {

            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);

        }

//        for (String word : wordFrequency.keySet()) {
//
//            System.out.println(word + " ----> " + wordFrequency.get(word));
//
//        }


        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {

            System.out.println(entry.getKey() + " ----> " + entry.getValue());

        }


    }


}
