package amol.conditionals;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("number");
        int a = in.nextInt();
         int s = 0;
        while(s <= a){
            System.out.println(s);
            s = s + (s+1);

        }
    }
}
