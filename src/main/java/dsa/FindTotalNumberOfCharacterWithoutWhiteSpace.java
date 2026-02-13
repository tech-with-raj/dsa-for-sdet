package main.java.dsa;

public class FindTotalNumberOfCharacterWithoutWhiteSpace {

    public static void main(String[] args) {

        String str = " hello world raj me";

        char[] strArray = str.toCharArray();

        int count = 0;

        for (int index = 0; index < strArray.length; index++) {

            if (strArray[index] == ' ') {

                continue;
            }

            boolean spaceBeforeChar = ((index > 0) && (strArray[index - 1] == ' '));
            boolean spaceAfterChar = ((index < str.length()-1) && (strArray[index + 1] == ' '));

            if(!spaceBeforeChar && !spaceAfterChar){

                count++;
            }


        }

         System.out.println("The total number of Character without white space before and after it is "+count);

    }

}
