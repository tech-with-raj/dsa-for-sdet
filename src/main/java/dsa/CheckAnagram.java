package main.java.dsa;

import java.util.Arrays;

public class CheckAnagram {

    public static void main(String[] args) {

        String str1 = "Silent";
        String str2 = "Listen";

        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();

        if (s1.length() == s2.length()) {

            char[] s1Array = s1.toCharArray();
            char[] s2Array = s2.toCharArray();

            Arrays.sort(s1Array);
            Arrays.sort(s2Array);

            if (Arrays.equals(s1Array, s2Array)) {

                System.out.println("These Strings are anagram");
            } else {
                System.out.println("These Strings are not anagram");
            }

        } else {

            System.out.println("These Strings are not anagram");
        }

    }

}
