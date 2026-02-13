package main.java.dsa;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsInStringUsingSet {

    public static void main(String[] args){

        String input = "Hello Word";
        int count = 0;

        Set<Character> vowelSet = new HashSet<Character>();

        vowelSet.add('a');
        vowelSet.add('e');
        vowelSet.add('i');
        vowelSet.add('o');
        vowelSet.add('u');
        vowelSet.add('A');
        vowelSet.add('E');
        vowelSet.add('I');
        vowelSet.add('O');
        vowelSet.add('U');


        for(int index = 0; index < input.length(); index++){

            if(vowelSet.contains(input.charAt(index))){
                count++;
            }

        }

        System.out.println("Vowels count in the String "+input+" is "+count);

    }

}
