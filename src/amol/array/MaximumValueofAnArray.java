package amol.array;

public class MaximumValueofAnArray {
    public static void main(String[] args) {
        int [] arr ={1,5,88,33,44};

        System.out.println(max(arr));
        System.out.println(maxRange(arr,3,4));
    }

    static int max(int[] arr){
        int maxno = arr[0];
        for(int i=1; i< arr.length;i++){
            if(arr[i]> maxno){
                maxno = arr[i];

            }
        }
        return maxno;
    }
               // Find between the range
    static int maxRange(int[] arr, int start , int end){
        int maxno = arr[start];
        for(int i=start; i<=end;i++){
            if(arr[i]> maxno){
                maxno = arr[i];
            }
        }
        return maxno;
    }
}
