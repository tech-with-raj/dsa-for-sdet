package main.java.dsa;

public class CountVowelsInString {

    public static void main(String[] args){

        String input = "Hello Word";
        String vowels = "aeiouAEIOU";
        int count = 0;

        for(int index = 0; index < input.length(); index++){

            if(vowels.indexOf(input.charAt(index))!=-1){

                count++;
            }

        }

        System.out.println("Vowels count in the String "+input+" is "+count);

    }

}
