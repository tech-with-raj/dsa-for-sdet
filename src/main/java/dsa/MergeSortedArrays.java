package main.java.dsa;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void main(String[] args){

        int[] a1 = {1,3,5};
        int[] a2 = {2,4};
        int[] a3 = new int[a1.length+a2.length];
        int indexOfa1 = 0;
        int indexOfa2 = 0;
        int indexOfa3 = 0;

        while(indexOfa1 < a1.length && indexOfa2 < a2.length){

            if(a1[indexOfa1] < a2[indexOfa2]){
               a3[indexOfa3] = a1[indexOfa1];
               indexOfa1++;
               indexOfa3++;

            }else {
                a3[indexOfa3] = a2[indexOfa2];
                indexOfa2++;
                indexOfa3++;
            }
        }

        while (indexOfa1 < a1.length){
            a3[indexOfa3] = a1[indexOfa1];
            indexOfa1++;
            indexOfa3++;
        }
        while (indexOfa2 < a2.length){
            a3[indexOfa3] = a2[indexOfa2];
            indexOfa2++;
            indexOfa3++;

        }

        System.out.println(Arrays.toString(a3));
    }

}
