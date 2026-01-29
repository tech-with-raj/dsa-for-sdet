package main.java.LogicBuilding;

public class ReverseCaseInString {

    public static void main(String[] args) {

        String input = "Rajasekar K";

        char[] inputCharArray = input.toCharArray();

        StringBuilder sb = new StringBuilder();

        for (char c : inputCharArray) {

            if (Character.isUpperCase(c)) {

                sb.append(Character.toLowerCase(c));

            } else if (Character.isLowerCase(c)) {

                sb.append(Character.toUpperCase(c));

            } else {
                sb.append(c);
            }
        }

        System.out.print(sb);

    }


}
