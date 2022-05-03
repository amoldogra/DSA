package com.amol.recursion;

public class ReverseNumber {
    public static void main(String[] args) {
        revNum(5658);
        System.out.println(sum);
    }
    static int sum=0;
    static  void revNum(int n){
        if(n==0)return;
        int rem = n%10;
        sum = sum*10+rem;
        revNum(n/10);
    }


}
