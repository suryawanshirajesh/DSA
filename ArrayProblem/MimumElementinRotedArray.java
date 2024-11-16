public class MimumElementinRotedArray {
    public static int search(int arr[]){
        int min=Integer.MAX_VALUE;
        int low=0,high=arr.length-1;
           while(low<=high){
            int mid=(low+high)/2;
          
            if(arr[low]<=arr[mid]){
               min=Integer.min(arr[low], min);
                low=mid+1;
            }else{
               high=mid-1;
               min=Integer.min(min,arr[mid]);

            }
        }
        return min;
    }
    public static void main(String[] args) {
                                  //0,1,2,3,4,5,6,7 
                      //int [] arr = {4,5,6,7,0,1,2,3};
                                  //0,1,2,3,4,5,6,7 
                      int [] arr = {8,9,1,3,4,5,6,7};
                      int result=search(arr);
                      System.out.print("Result : "+result);

    }
}
