package amol.Switch;

import java.util.Scanner;

public class weekEndOrDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int day = in.nextInt();
//                          ENHANCED METHOD
//        switch (day) {
//            case 1, 2, 3, 4 -> System.out.println("Weekdays");
//            case 5, 6 -> System.out.println("Weekends");
//        }
        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
        }
    }
}
