package com.amol.linearSearch;

//   https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigit {
    public static void main(String[] args) {
        int[] nums = {55,69365,55,2,526,3,156,1,65,17,};
        System.out.println(findNumbers(nums));
      //  System.out.println(digits(31365464));   to check working of digits(); function
      //  System.out.println(even(335436));       to check working of even(); function
    }
    static int findNumbers(int[] nums){
       int count = 0;
       for(int i : nums) {
           if (even(i)) {
               count++;
           }
       }
             return count;
    }
    static boolean even(int num){
        int numOFDigits = digits(num);
        return numOFDigits%2 == 0;

                                //  OR
     //   if(numOFDigits%2==0){
     //       return true;
     //   }
     //   return false;

    }
    static int digits(int nums){

        if (nums<0) {
            nums *= -1;
        }
        if(nums ==0){
            return 1;
        }
        int count =0;
        while (nums>0){
            count++;
            nums = nums/10;
        }
        return count;
    }
}
