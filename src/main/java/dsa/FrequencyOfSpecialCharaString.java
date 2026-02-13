package main.java.dsa;

import java.util.HashMap;

public class FrequencyOfSpecialCharaString {

    public static void main(String[] args) {

        String input = "sien@%67&*(())";

        char[] inputArray = input.toCharArray();

        HashMap<Character, Integer> frequencyMap = new HashMap<Character, Integer>();


        for (char c : inputArray) {

            if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z') || (c == ' '))) {

                if (frequencyMap.containsKey(c)) {

                    frequencyMap.put(c, frequencyMap.get(c) + 1);

                } else {

                    frequencyMap.put(c, 1);
                }
            }

        }

        for (char character : frequencyMap.keySet()) {

            System.out.println(character + "--->" + frequencyMap.get(character));
        }

        System.out.println(frequencyMap);
    }
}
