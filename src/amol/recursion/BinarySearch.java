package com.amol.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binSea(arr,5, 1, 5));
    }

    static  int binSea(int[] arr, int n, int s, int e){
         if(s>e){
             return -1;
         }
         int m = s+(e-s)/2;
         if(arr[m] == n){
             return m;
         }
         if(n < arr[m]){
          return    binSea(arr,n,s,m-1);

         }
         return binSea(arr,n,m+1,e);
    }
}
