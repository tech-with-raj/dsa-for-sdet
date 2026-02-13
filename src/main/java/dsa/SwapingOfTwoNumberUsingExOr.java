package main.java.dsa;

public class SwapingOfTwoNumberUsingExOr {

    public static void main(String[] arg){

        int a = 10;
        int b = 20;

        a = a^b;
        System.out.println("Value of a="+a);
        b = a^b;
        System.out.println("Value of b="+b);
        a = a^b;
        System.out.println("Value of a="+a);
    }
}
