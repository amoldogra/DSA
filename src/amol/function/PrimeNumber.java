package amol.function;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
    }

     static boolean isPrime(int a) {
         if (a <= 0) {
             return false;

         }
            int c =2;
         while (c*c<=a){
             if(a%c==0){
                 return false;
             }
             c++;
         }
         return c * c > a;
     }
}
