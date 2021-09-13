package com.amol.linearSearch;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("No of elements = ");
        int n =in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
            System.out.print("Target = ");
            int target = in.nextInt();
        System.out.print("Index1 = ");
            int range1 = in.nextInt();
        System.out.print("Index2 = ");
            int range2 = in.nextInt();
            System.out.println(searchInRange(arr, range1, range2, target));


    }
    static boolean searchInRange(int[] arr, int index1, int index2, int target){
        if(arr.length ==0){
            return false;
        }
        for(int i=index1;i<=index2;i++){
            if(target == arr[i]){
                return true;
            }

        }
        return false;
    }
}
