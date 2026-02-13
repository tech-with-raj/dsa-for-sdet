package main.java.dsa;

public class ReplaceVowelsWithXIInString {

    public static void main(String[] args) {

        String name = "Rajasekar";

        char[] inputArray = name.toCharArray();

        StringBuilder finalName = new StringBuilder();

        for (char currentCharacter : inputArray) {

            if(isVowel(currentCharacter))
            {

                finalName.append('x');

            }else{

                finalName.append(currentCharacter);
            }

        }

        System.out.println(finalName);

    }


    public static boolean isVowel(char currentCharacter) {

        if (currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i'
                || currentCharacter == 'o' || currentCharacter == 'u' || currentCharacter == 'A' || currentCharacter == 'E' || currentCharacter == 'I'
                || currentCharacter == 'O' || currentCharacter == 'U') {

            return true;

        } else {

            return false;
        }

    }

}
