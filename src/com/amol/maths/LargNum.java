package com.amol.maths;

import java.util.Scanner;

public class LargNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
//                                                 METHOD #1
//        if(num1>num2){
//            if(num1>num3){
//                System.out.println(num1);
//            }
//            else{
//                if(num3>num2){
//                    System.out.println(num3);
//                }
//                else{
//                    System.out.println(num2);
//                }
//            }
//        }
//        else {
//            if(num2>num3){
//                System.out.println(num2);
//            }
//            else{
//                System.out.println(num3);
//            }
//        }
//                                                    METHOD #2
//                       int max= num1;
//                       if(num2 > max){
//                           max = num2;
//                       }
//                       if(num3 > max){
//                          max = num3;
//                         }
//                       System.out.println(max);

//                                                   METHOD #3

        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println(max);

        }

    }
