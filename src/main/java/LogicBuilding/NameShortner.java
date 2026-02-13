package main.java.dsa;

public class NameShortner {

    public static void main(String[] args){

        String fullName = "Rajasekar Muthu Subramanian";

        String[] nameArray =fullName.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int index =0;  index < nameArray.length-1; index++){

            sb.append(nameArray[index].charAt(0));
            sb.append(".");
        }

        sb.append(nameArray[nameArray.length-1]);

        System.out.println("Shorter name of "+fullName+" is "+sb);

    }

}
