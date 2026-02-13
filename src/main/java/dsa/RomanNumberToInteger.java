package main.java.dsa;

import java.util.HashMap;

public class RomanNumberToInteger {

    public static void main(String[] args) {

        String romanNumber = "XVI";
        int result = 0;
        int previousValue = 0;

        HashMap<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);

        for (int i = romanNumber.length() - 1; i >= 0; i--) {

            char currentCharacter = romanNumber.charAt(i);
            int currentNumber = romanMap.get(currentCharacter);

            if (currentNumber >= previousValue) {
                result = result + currentNumber;
            } else {
                result = result - currentNumber;
            }

            previousValue = currentNumber;
        }

        System.out.println("Integer value of Roman Number " + romanNumber + " is " + result);
    }
}
