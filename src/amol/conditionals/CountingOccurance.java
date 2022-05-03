package amol.conditionals;

import java.util.Scanner;

public class CountingOccurance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int num = in.nextInt();
         int count = 0;
         while(a>0){
             int rem = a%10;
             if(num == rem){
                 count++;
             }
             a = a/10;
         }
        System.out.println(count);
    }
}
