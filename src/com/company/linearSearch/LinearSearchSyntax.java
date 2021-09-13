package com.company.linearSearch;

public class LinearSearchSyntax {
    public static void main(String[] args) {
        int[] arr = {44,55,66,11,22,33,77,8};
        int target = 8;

        System.out.println(linearSearch(arr,target));

    }
    static  int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return  -1;
        }

        for(int i =0;i< arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;

    }
}
