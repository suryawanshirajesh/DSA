public class Findouthowmanytimearrayroted {
    public static int search(int arr []){
        int count=Integer.MAX_VALUE;
        int low=0,high=arr.length-1;
        int index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if (arr[low] <= arr[high]) {
                count = Math.min(count, arr[low]);
                if(arr[low]<count){
                    index=low;
                }
                break;
            }
            if(arr[low]<=arr[mid]){
            count=Math.min(arr[low], count);
            if(arr[low]<count){
                index=low;
            }
            low=mid+1;
            }else{
                high=mid-1;
                if(arr[mid]<count){
                    index=mid;
                }
                count=Math.min(arr[mid], count);
            }
        }
      //  return count;
      return index;
    }
    public static void main(String[] args) {
        int [] arr = {8,9,1,3,4,5,6,7};
        int result=search(arr);
        System.out.print("Result : "+result);
    }
}
