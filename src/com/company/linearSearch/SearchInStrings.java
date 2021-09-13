package com.company.linearSearch;

import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        char target = in.next().charAt(0);
       // String name = "ElonMusk";
       // char target = 'n';
        System.out.println(searchString(name,target));
    }
    static boolean searchString(String str, char target){
        if(str.length() ==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
             char element = str.charAt(i);
            if(element == target){
                 return true;

            }
        }
        return  false;
    }
}
