

public class MissingNumber {
    public static int find(int [] arr){
        int n=arr.length;
       int sum = (n*(n+1))/2;
       int arraysum=0;
       for(int i=0;i<n;i++){
         arraysum+=arr[i];
       }
       int missingnumber=sum-arraysum;
       return missingnumber;
    }
    public static void main(String[] args) {
        int [] arr={3,0,1};
        int result=find(arr);
        System.out.println("Result :"+result);
    }
}
