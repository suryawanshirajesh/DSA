import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Study {
   
    public static int search(int [] arr,int low,int high,int target){
        if (low > high) {
            return -1; // Base case: target not found
        }
      int mid=(low+high)/2;
      if(arr[mid]==target) return mid;
      else if(arr[mid]<target) return search(arr, mid+1, high, target);
      else return search(arr, low, mid-1, target);
   
    }
   public static void main(String[] args) {
    int [] arr={-1,0,3,5,9,12,14};
    int target=0;
    int low=0,high=arr.length-1;
    int result =search(arr,low,high,target);
    System.out.println("Result : "+ result);
   }
}
