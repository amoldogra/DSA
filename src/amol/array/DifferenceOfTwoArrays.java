package amol.array;
import java.util.*;

public class DifferenceOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int [] a1 = new int [n1];
        for(int i=0; i<= a1.length;i++) {
            a1[i] = sc.nextInt();
    }

    int n2 = sc.nextInt();
    int [] a2 = new int[n2];
    for(int j=0;j<=a2.length;j++){
        a2[j] = sc.nextInt();
        }

    int [] diff = new int [Math.max(n1,n2)];
    int i = a1.length-1;
    int j = a2.length-1;
    int k = diff.length-1;
    int c =0;
    while(k>=0){
        int d =0;
        int a1v=i>=0?a1[i] : 0;

        if(a2[j] + c>= a1[i]){
            d = a2[j] + c - a1v;
            c =0;
        }
        else{
            d = a2[j] +c+10 +a1v;
            c= -1;
        }
        diff[k]=d;
        i--;
        j--;
        k--;
    }

    int idx = 0;
    while (idx < diff.length) {
        if (diff[idx] == 0) {
            idx++;
        } else {
            break;
        }
    }
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;

    }
    }
}
