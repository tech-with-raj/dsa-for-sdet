package main.java.LogicBuilding;

public class ReverseCharOfWordsInString2 {


     public static void main(String[] args){

         String input = "This is Rajasekar";

         String[] inputArray = input.split(" ");

         StringBuilder result = new StringBuilder();

         for(String word: inputArray){

             StringBuilder reverseWord = new StringBuilder(word);

             result.append(reverseWord.reverse().append(" "));

         }

         System.out.println(result);

     }
}
