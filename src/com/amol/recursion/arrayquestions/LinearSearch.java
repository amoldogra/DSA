package com.amol.recursion.arrayquestions;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args){

        int[] arr = {44,88,66,22,22,6,85,23};
        System.out.println(search(arr,77,0));
        System.out.println(find(arr,90,0));
        findAllIndex(arr,22, 0);
        System.out.println(list);
    }
    static boolean search(int[] arr, int target, int index){
        if(index == arr.length){
          return false;                                             // this gives output as true or false
        }
        return arr[index] == target || search(arr,target,index+1);
    }


     static  int find(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){                                  // this gives output as index of target
            return index;
        }
        else{
            return find(arr,target,index+1);
        }
     }

     static ArrayList <Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;                                               // output as index of multiple values
        }
        if(arr[index] == target){
            list.add(index);
        }
           findAllIndex(arr, target, index+1);

    }
}
