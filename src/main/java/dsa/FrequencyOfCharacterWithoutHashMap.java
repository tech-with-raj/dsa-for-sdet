package main.java.dsa;

public class FrequencyOfCharacterWithoutHashMap {

    public static void main(String[] args) {

        String input = "aabbeeiidkdekdl@iedk03kd";

        char[] inputArray = input.toCharArray();

        int[] frequencyArray = new int[256];

        for (char current : inputArray) {

            frequencyArray[current]++;

        }

        for (int i = 0; i < frequencyArray.length; i++) {

            if (frequencyArray[i] > 0) {
                System.out.println((char)i+"-->"+frequencyArray[i]);
            }
        }

    }
}
