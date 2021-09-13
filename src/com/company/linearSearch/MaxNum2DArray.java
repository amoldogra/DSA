package com.company.linearSearch;

public class MaxNum2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {4,6,9,3,5},
                {4,9,2,66,55,44},
                {55,88,99,100,55,46},
                {44,88,22}
        };
        System.out.println(maxNum(arr));
    }

    static int maxNum(int[][] arr){
        int ans = arr[0][0];                     // or   Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=0; j < arr[i].length ;j++){
                 if(arr[i][j]>ans){
                     ans = arr[i][j];
                 }
            }
        }

        return ans;
}
          //  Using Enhanced For Loop

    static int max(int[][] arr) {
       int max = Integer.MIN_VALUE;
       for (int[] ints : arr) {
           for (int element : ints) {
               if (element > max) {
                   max = element;
               }
           }
       }
       return max;
   }
    }