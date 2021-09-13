package com.amol.linearSearch;
  // https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr ={
                {4,5,6},
                {1,2,3},
                {7,8,9}
        };
        System.out.println(maximumWealth(arr));
    }
       static int maximumWealth(int[][] accounts) {
        int  ans = Integer.MIN_VALUE;
            for(int i=0;i< accounts.length;i++){
                int sum=0;

                for(int j=0;j<accounts[i].length;j++){

                    sum += accounts[i][j];
                }
                if(sum > ans){
                    ans  = sum;
            }
            }
            return ans;
      }
}
