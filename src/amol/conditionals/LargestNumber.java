package amol.conditionals;

import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        System.out.println("a: "+a);
        int b = input.nextInt();
        System.out.println("b: "+b);
        int c = input.nextInt();
        System.out.println("c: "+c);

        if(a>b){
            if(a>c){
                System.out.printf("a is greater");
            }
            else{
                System.out.println("c is greater");
            }
        }
        else{
            if(b>c){
                System.out.println("b is greater");
            }
            else{
                System.out.println(" c is greater");
            }
        }

    }
}
