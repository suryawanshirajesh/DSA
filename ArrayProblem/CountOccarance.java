public class CountOccarance {
    public static int firstOccurrence(int []arr,int target){
        int ans=-1;
        int low=0,high=arr.length-1;
        while(low<=high){
         int mid=(low+high)/2;
         if(arr[mid]==target){
            ans=mid;
            high=mid-1;
         }else if(arr[mid]>target){
            high=mid-1;
         }else{
            low=mid+1;
         }
        }
        return ans;
    }

    public static int lastOccurrence(int []arr,int target){
        int ans=-1;
        int low=0,high=arr.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if(arr[mid]==target){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]>target){
                   high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int count(int arr[],int target){
        int count=0;
        int first=firstOccurrence(arr, target);
        if(first==-1)return count;
        int last= lastOccurrence(arr, target);
        return last-(first)+1;
    }
    public static void main(String[] args) {
        int[] arr =  {2, 4, 6, 8, 8, 11,11,11, 13};
        int count= count(arr, 11);
        System.out.println("count : "+count);
    }
}
