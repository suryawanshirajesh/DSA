public class FindPeekelement {
    public static int FindPeek(int arr []){
     int n = arr.length;
     if(n==1) return arr[0];
     if(arr[0]>arr[1]) return arr[0];
     if(arr[n-1]>arr[n-2]) return arr[n-1];
     int low=1,high=n-2;
     if(low<=high){
        int mid = (low+high)/2;

        if(arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1])return arr[mid];

     }
    return -1;
    }
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,3,2,1};
        int result = FindPeek(arr);
        System.out.print("Result : "+ result);
    }
}
