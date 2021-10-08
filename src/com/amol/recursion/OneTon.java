package com.amol.recursion;

public class OneTon {
    public static void main(String[] args) {
        funRev(1000);
    }
    static void funRev(int n){
        if(n==0)return;
        funRev(n-1);
        System.out.println(n);

    }

}
