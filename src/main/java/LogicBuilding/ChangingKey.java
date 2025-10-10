package main.java.LogicBuilding;

public class ChangingKey {

    public static void main(String[] args){

        int count = 0;
        char lastKey;
        char currentKey;

        String input = "abBc";

        char[] inputArray =input.toLowerCase().toCharArray();
        lastKey =inputArray[0];

        for(int i = 1; i<=inputArray.length-1; i++){

            currentKey = inputArray[i];

            if(lastKey != currentKey){

                count++;
            }

            lastKey = currentKey;
        }

        System.out.println("The total number of keys changed is "+count);

    }

}
