package main.java.dsa;

public class EvenWordsOfString {

    public static void main(String[] args) {

        String sentence = "Hi this maharajahs from chennai you want to learn java if yes says okay to me";

        String[] sentenceArray = sentence.trim().split(" ");

        for (String eachWord : sentenceArray) {

            if ((eachWord.length() % 2 == 0)) {
                System.out.println(eachWord);
            }
        }

    }

}
