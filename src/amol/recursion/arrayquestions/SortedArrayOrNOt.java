package com.amol.recursion.arrayquestions;

public class SortedArrayOrNOt {
    public static void main(String[] args) {
           int[] arr = {2,4,6,8,20,12,14};
        System.out.println(sorted(arr, 0));
    }

    static boolean sorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        }
        return arr[index] < arr[index + 1] && sorted(arr, index + 1);

    }
}
