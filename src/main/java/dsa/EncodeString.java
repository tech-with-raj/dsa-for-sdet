package main.java.dsa;
/*
Problem Statement:
------------------
Write a program to perform Run-Length Encoding on a given string.

Run-Length Encoding is a simple compression technique where
consecutive repeating characters are replaced with the character
followed by the number of times it appears consecutively.

Example:
Input  : "ddmmmaaaab"
Output : "d2m3a4b1"

Explanation:
d appears 2 times -> d2
m appears 3 times -> m3
a appears 4 times -> a4
b appears 1 time  -> b1

Final encoded string -> d2m3a4b1
*/

class EncodeString {

    public static void main(String[] args) {

        String input = "ddmmmaaaab";

        StringBuilder encodedString = new StringBuilder();

        int count = 1;

        // Traverse the string starting from the second character
        for (int i = 1; i < input.length(); i++) {

            // If current character equals previous character
            if (input.charAt(i) == input.charAt(i - 1)) {

                count++;

            } else {

                // Append previous character and its count
                encodedString.append(input.charAt(i - 1));
                encodedString.append(count);

                // Reset counter
                count = 1;
            }
        }

        // Handle the last character group
        encodedString.append(input.charAt(input.length() - 1));
        encodedString.append(count);

        System.out.println("Encoded String: " + encodedString);
    }
}

/*
Time Complexity:
O(n)
We traverse the string once.

Space Complexity:
O(n)
StringBuilder stores the encoded result.

Example Run:
Input  : ddmmmaaaab
Output : d2m3a4b1
*/