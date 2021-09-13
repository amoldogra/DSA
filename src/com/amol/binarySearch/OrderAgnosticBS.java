package com.amol.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,22,33,44,55,66,77,88,99,100};
        System.out.println(orderAgnostic(arr,7));

    }
static int orderAgnostic(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                } else if(target>arr[mid]){
                    start = mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    start = mid+1;

                } else if(target>arr[mid]){
                    end = mid-1;
                }
            }

        }
        return -1;
    }
}
