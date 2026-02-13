package main.java.dsa;

public class IntegerToRomanNumber {

    public static void main(String[] args){

        int num = 22;
        String[] romanArray = {"L","X","V","I"};
        int[] romanCorrespondingNum = {50,10,5,1};

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < romanCorrespondingNum.length; i++){

            while(num >= romanCorrespondingNum[i]){

                num = num - romanCorrespondingNum[i];
                sb.append(romanArray[i]);

            }

        }

        System.out.println("Roman Number of Integer "+num+" is "+sb.toString());

    }
}
