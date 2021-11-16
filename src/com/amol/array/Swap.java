package com.amol.array;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {4, 5, 56, 48, 100};
       swapArray(arr, 2,3);   //  always initialize index of elements here

    }
     static void swapArray(int[] abb, int index1, int index2){
       int temp = abb[index1];
       abb[index1]=abb[index2];
        abb[index2]=temp;


         System.out.println(Arrays.toString(abb));

    }
}
