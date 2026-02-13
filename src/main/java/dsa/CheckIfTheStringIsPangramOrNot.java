package main.java.dsa;

public class CheckIfTheStringIsPangramOrNot {

    public static void main(String[] args) {

        String statement = "Hello world";

        String statementLowerCase = statement.toLowerCase();

        boolean result = checkPangram(statementLowerCase);

        if (result) {

            System.out.println(statement + " 'is a Pangram'");
        } else {

            System.out.println(statement + " 'is not a Pangram'");

        }


    }


    public static boolean checkPangram(String sentence) {

        if (sentence.length() < 26) {

            return false;
        }

        for (char i = 'a'; i <= 'z'; i++) {

            if (sentence.indexOf(i) < 0) {

                return false;
            }
        }

        return true;
    }
}
