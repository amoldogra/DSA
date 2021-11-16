package com.amol.maths;
import java.util.*;

public class Basic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                                                         //   GRADING SYSTEM

   /*     System.out.print("ENTER MARKS : ");
        int marks = sc.nextInt();
        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("Good");
        } else if (marks > 70) {
            System.out.println("fair");
        } else if (marks > 60) {
            System.out.println("meets");
        } else {
            System.out.println("below par");
        }
                                                               //      PRIME NUMBER
        System.out.print("Number for elements : ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int count = 0;
            for (int div = 2; div * div <= n; div++) {
                if (n % div == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            } else {
                System.out.println("non prime");
            }
        }

                                                      //    PRIME NUMBER BETWEEN LIMIT
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int n = low; n <= high; n++) {
            int count = 0;
            for(int div=2;div*div<=n;div++){
                if(n%div == 0){

                count++;
                break;
            }}
            if (count == 0 ) {
                System.out.println(n);
            }
        }
                                                           //    FIBONACCI SERIES

        int n = sc.nextInt();
        int result = 0  ;
        int a = 1;
        for(int i = 0;i<n;i++){

            System.out.println(result);
            int c = result+a;
            result = a;
            a = c;

        }
                                                         // COUNT DIGIT IN NUMBER

        int n = sc.nextInt();
        int dig = 0;
        while(n!= 0){
            n= n/10;
            dig++;
        }
        System.out.println(dig);

                                                             //  GCD AND LCM

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int on1 = num1;
        int on2 = num2;
             while (num1 % num2 != 0){
                 int rem = num1%num2;
                 num1 = num2;
                 num2 = rem;
             }
            int gcd  = num2;
int lcm = (on1 * on2)/gcd;

        System.out.println(gcd);
        System.out.println(lcm);


                                                             // PRIME FACTORIZATION

        int n  =  sc.nextInt();
         for(int div = 2 ; div * div<=n ; div++){
             while(n%div == 0){
                 n = n/div;
                 System.out.print(div);
             }
         }
         if(n!=1){
             System.out.print(n);
         }




                                                       // PYTHAGOREAN TRIPLET

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if (b >= max) {
            max = b;
        }
        if (c >= max) {
            max = c;
        }
        if (max == a) {
            boolean flag = (b*b + c*c ==  a*a);
            System.out.println(flag);
        } else if (max == b) {
            boolean flag = (c*c + a*a == b*b);
            System.out.println(flag);
        } else {
            boolean flag  = (a*a + b*b == c*c);
            System.out.println(flag);
        }

    */

                                                  // BENJAMIN BULB

        int n = sc.nextInt();
        for(int i=1;i*i <= n ;i++){
            System.out.println(i*i);
        }
    }
}