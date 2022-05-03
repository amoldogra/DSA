package amol.function;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        isArmstrong(a);
    }
    static boolean  isArmstrong(int a) {
        int sum = 0;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
            sum = sum + rem * rem * rem;
        }
        if (sum == a) {
            return true;
        } else {
            return false;
        }

    }
}
