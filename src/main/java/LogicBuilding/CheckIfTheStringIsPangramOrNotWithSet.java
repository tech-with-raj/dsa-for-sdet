package main.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class CheckIfTheStringIsPangramOrNotWithSet {

    public static void main(String[] args) {


        String statement = "The quick brown fox jumps over the lazy dog!!!";

        boolean result = checkPangram(statement);

        if (result) {
            System.out.println(statement + " 'is a Pangram'");
        } else {
            System.out.println(statement + " 'is not a Pangram'");
        }

    }

    public static boolean checkPangram(String sentence) {
        // Convert to lowercase
        sentence = sentence.toLowerCase();

        // Create a Set to store unique characters
        Set<Character> letters = new HashSet<>();

        // Add only alphabets into the Set
        for (char c : sentence.toCharArray()) {
//            if (c >= 'a' && c <= 'z') {
//                letters.add(c);
//            }

            if(Character.isAlphabetic(c)){

                letters.add(c);
            }
        }

        // Pangram check: if set size = 26, then it's a pangram
        return letters.size() == 26;
    }

}


