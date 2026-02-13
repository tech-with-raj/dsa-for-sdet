package main.java.dsa;

public class FindTheLengthOfTheLastWordInString {

    public static void main(String[] arg){

        String value =  "   Hello    World! raj blast ";

        String afterTrim =value.trim();
        String[] splitedValue =afterTrim.split(" ");

        String lastWord = splitedValue[splitedValue.length-1].trim();
        System.out.println(lastWord);
        System.out.println(lastWord.length());
    }

}
