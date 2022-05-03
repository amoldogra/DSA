package com.amol.linearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("No.of elements in array:");
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("index 1: ");
        int index1 = in.nextInt();
        System.out.print("index 2:");
        int index2 = in.nextInt();
        System.out.print("target:");
        int target = in.nextInt();

        System.out.println(searchInRange(arr,index1,index2, target));
    }
    static int searchInRange(int[] arr, int index1, int index2, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = index1; i <= index2; i++) {
            if (arr[i] == target) {
                return i;
            }

        }
        return -1;
    }
    }
