public class LongestSubArraywithSumK {
    public static int LongestSubArray(int [] arr,int k){
        int precount=0;
        int count=0;
        int sum=0;
        int start=0;
        int end=0;
      for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            sum+=arr[j];
            count++;
            if(sum==k){
                if(precount<count){
                    precount=count;
                    start=i;
                    end=j;
                }
             count=0;
             sum=0;
             break;
            }
        }
      }
      for(int i=start;i<=end;i++){
        System.out.print(arr[i]+" ,");
      }
      System.out.println("Result : "+precount);
      return precount;
    }
    public static void main(String[] args) {
        int k=15;
        int arr[] = {-1, 2, 3};
       // int [] arr={10, 5, 2, 7, 1, 9};
        int result=LongestSubArray(arr,k);
        System.out.println("Result :"+result);
    }
}
