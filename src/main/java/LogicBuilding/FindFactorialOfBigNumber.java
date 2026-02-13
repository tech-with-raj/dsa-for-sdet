package main.java.dsa;

import java.math.BigInteger;

public class FindFactorialOfBigNumber {

    public static void main(String[] arg){

       int number = 50;
       BigInteger result = BigInteger.ONE;

       for(int i = 1; i<= number; i++){

           result = result.multiply(BigInteger.valueOf(i));

       }

       System.out.println(result);

    }
}
