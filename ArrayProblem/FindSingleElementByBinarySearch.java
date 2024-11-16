public class FindSingleElementByBinarySearch {
    public static int Search(int arr []){
      int n=arr.length;
      int low=1,high=n-2;
      if(n==1)return arr[0];
      if(arr[0]!=arr[1] )return arr[0];
      if(arr[n-1]!=arr[n-2])return arr[n-1];


      while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid-1]!=arr[mid]&&arr[mid+1]!=arr[mid]) return arr[mid];
        if(mid%2==1&&arr[mid]==arr[mid-1] || mid%2==0&&arr[mid]==arr[mid+1]){
            low=mid+1;
        }else{
            high=mid-1;
        }
      }
      return -1;
    }
    public static void main(String[] args) {
                    //1,2,3,4,5,6,7,8,9,10,11
        int [] arr = {1,1,2,2,3,3,4,5,5,6,6};
        int result = Search(arr);
        System.out.print("Result : "+result);
    }
}
