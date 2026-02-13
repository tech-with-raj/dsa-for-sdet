package main.java.dsa;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateLetterFromString {

    // i/p - "java"
    // o/p - "jav"

    public static void main(String[] args) {

        String name = "Rajasekar";

        char[] arrayOfChar = name.toCharArray();

        Set<Character> obj = new LinkedHashSet<Character>();

        for (char nameLetter : arrayOfChar) {

            obj.add(nameLetter);

        }

        StringBuilder builder = new StringBuilder();

        for (char namefromset : obj) {

            builder.append(namefromset);
        }

        String finalName = builder.toString();

        System.out.println(finalName);
    }

}
