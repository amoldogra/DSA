package amol.binarySearch;
// Floor - Number which is greatest smallest number or equal to target number
public class Floor {
     public static void main(String[] args){
         int[] arr = {1,2,3,4,6,7,8,9,10,11,12,13};
                 System.out.println(floorNumber(arr,5));
     }

     static int floorNumber(int[] arr, int target){
         int start = 0;
         int end = arr.length-1;
         while(start <= end){
             int mid = start + (end - start)/2;
             if(target > arr[mid]){
                 start = mid +1;
             } else if (target < arr[mid]) {
                 end = mid -1;
             }
             else{
                 return mid;
             }
         }
         return end;
     }
}
