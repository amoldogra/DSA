package amol.array;

public class TwoDArray {
    public static void main(String[] args) {
    /*    Scanner arr = new Scanner(System.in);
        int[][] arr2D = new int[3][];

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
              int[row][col]=arr.nextInt();
            }

        }*/


        int[][] arr = {
                {4,5,6,1},
                {4,5},
                {4,8,9}
        };
        for(int row=0; row< arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
