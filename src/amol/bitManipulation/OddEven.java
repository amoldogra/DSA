package com.amol.bitManipulation;

public class OddEven {
    public static void main(String[] args) {
        int n =69;
        System.out.println(isOdd(n));

    }
    static String isOdd(int n){
        if((n&1)==1){
            return "odd number";
        }
        return "even number";
    }

}
