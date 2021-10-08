package com.amol.recursion;

public class ProductOFDigit {
    public static void main(String[] args) {
        System.out.println(digitPro(55));
    }
            static int digitPro(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * digitPro(n/10);
    }
}
