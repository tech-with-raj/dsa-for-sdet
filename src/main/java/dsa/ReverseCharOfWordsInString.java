package main.java.dsa;

public class ReverseCharOfWordsInString {


    public static void main(String[] args) {

        String input = "This is Rajasekar";

        String[] inputArray = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : inputArray) {
            char[] charArray = word.toCharArray();

            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {

                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }

            result.append(new String(charArray)).append(" ");

        }

        System.out.println(result.toString().trim());

    }
}
