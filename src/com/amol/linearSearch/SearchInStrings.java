package com.amol.linearSearch;

import java.util.Scanner;

public class  SearchInStrings {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         String str =  "kunal";
         char target = 'o';
        System.out.println(search(str, target));


    }
    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i=0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
