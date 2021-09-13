package com.company.linearSearch;

public class MaxNumber {
    public static void main(String[] args) {
    int[] arr = {55,66,44,66,44,6,22,-4,55,88,99,44,};
        System.out.println(searchMaxNum(arr));
}
    static int  searchMaxNum(int[] arr){
        int ans = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>ans){
                ans = arr[i] ;
            }
        }
        return ans;
    }
}
