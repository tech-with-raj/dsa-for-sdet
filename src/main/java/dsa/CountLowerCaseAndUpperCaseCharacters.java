package main.java.dsa;

public class CountLowerCaseAndUpperCaseCharacters {

    public static void main(String[] args){

        String input = "aGskdSrikdkdSjkdSDGE";

        char[] inputArray =input.toCharArray();

        int upperCaseCount = 0;
        int lowerCaseCount = 0;


        for(char letter : inputArray){

            if(Character.isUpperCase(letter)){

                upperCaseCount++;

            }else if(Character.isLowerCase(letter)){

                lowerCaseCount++;
            }

        }

        System.out.println("UpperCase count is "+upperCaseCount);
        System.out.println("LowerCaseCount is "+lowerCaseCount);

    }


}
