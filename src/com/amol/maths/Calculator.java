package com.amol.maths;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

         while(true){

             System.out.println("Enter the Opertaor : ");
             char ch = in.next().trim().charAt(0);
            if(ch == '+' || ch == '-' || ch == '*' || ch == '%' || ch == '/'){

                System.out.println("Enter Two Numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if(ch == '+'){
                    ans = num1 + num2;
                    System.out.println(ans);
                }
                if(ch == '-'){
                    ans = num1 - num2;
                    System.out.println(ans);
                }
                if(ch == '*'){
                    ans = num1 * num2;
                    System.out.println(ans);
                }
                if(ch == '/'){
                    ans = num1 / num2;
                    System.out.println(ans);
                }
                if(ch == '%'){
                    ans = num1 % num2;
                    System.out.println(ans);
                }
                else if(ch == 'x' || ch == 'X'){
                   break;
                }
                else {
                    System.out.println("INVALID INPUT");
                }
            }
         }

    }
}
