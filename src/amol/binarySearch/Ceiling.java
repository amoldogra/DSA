package amol.binarySearch;
// ceiling - find number which is greater and equal to target number
public class Ceiling {

    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,9,10,11};
        System.out.println(Ceiling(arr,8));
    }

    static int Ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
