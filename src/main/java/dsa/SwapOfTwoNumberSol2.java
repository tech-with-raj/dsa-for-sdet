package main.java.dsa;

public class SwapOfTwoNumberSol2 {

    public static void main(String[] arg){

        int a = 10;
        int b =20;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a:"+a);
        System.out.println("Value of b:"+b);

    }
}
