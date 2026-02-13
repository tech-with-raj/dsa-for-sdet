package main.java.dsa;

public class ReverseFirstWordOfString {

    public static void main(String[] args) {

        String input = "Hello world from Java";

        if (input == null || input.isEmpty()) {

            System.out.println("Cannot resolve the reverse first word");

        } else {

            String[] inputArray = input.split(" ", 2);

            char[] charArray = inputArray[0].toCharArray();

//            StringBuffer stringBuffer = new StringBuffer();

            int left = 0;
            int right = charArray.length - 1;

            while (left < right) {

                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;

            }

//            stringBuffer.append(charArray);
//            stringBuffer.append(" ");
//            stringBuffer.append(inputArray[1]);

//            String result = input.replaceFirst("Hello", stringBuffer.toString());

            String revString = new String(charArray);
            System.out.println(revString+" "+inputArray[1]);
        }

    }

}
