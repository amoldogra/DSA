package com.company.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {55,66,55},
                {5,6,9,2},
                {1,88,36,47},
                {5,88,11,66,44}
        };
        System.out.println(findNum(arr,36));
        int[] ans = searchNum(arr,36) ;
        System.out.println(Arrays.toString(ans));
    }

    // answer in boolean  from
    static  boolean findNum(int[][] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int i=0;i< arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if( target == arr[i][j] ){
                    return true;
                }

            }
        }
        return false;
    }
    // answer in index form
      static  int[] searchNum(int[][] arr, int element){

          for(int i=0;i< arr.length;i++){
              for(int j=0;j<arr[i].length;j++){
                  if( element == arr[i][j] ){
                      return new int[]{i,j};
                  }

              }
          }
          return new int[]{-1,-1};
      }
}
