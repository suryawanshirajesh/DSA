public class FirstandLastOccoranse {
   
    public static int firstOccurrence(int [] arr,int target){
        int ans=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                high=mid-1;
            }
            if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }

    // Method to find the last occurrence of the target
    public static int lastOccurrence(int[] arr, int target) {
        int ans = -1;
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;  // store the index
                low = mid + 1;  // keep searching on the right side
            } else if (arr[mid] > target) {
                high = mid - 1;  // target is in the left half
            } else {
                low = mid + 1;  // target is in the right half
            }
        }

        return ans;  // returns -1 if not found
    }    public static void main(String[] args) {
        int array[] = {3,4,13,13,13,20,40};
        int target=13;
        int first=firstOccurrence(array, target);
        int last=-1;
        if(first!=-1){
       last=  lastOccurrence(array, target);
        }
        System.out.print("first : "+ first+" "+"last : "+last);
    }
}
