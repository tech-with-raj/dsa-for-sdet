package main.java.LogicBuilding;

public class FindLengthOfString {

    public static void main(String[] args){

        String input = "Hello Rajasekar";

         char[] charArray = input.toCharArray();

         int count = 0;

         for(char x: charArray){

             count++;

         }

         System.out.println("Lenght of String "+input+" is "+count);

    }

}
