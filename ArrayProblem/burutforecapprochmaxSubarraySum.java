public class burutforecapprochmaxSubarraySum {
    public static int maxSubarrySum(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
               if(max<sum){
                max=sum;
               }
            }
        }
    return max;
    }
    public static void main(String[] args) {
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
       int result= maxSubarrySum(arr); 
       System.out.print("Result : "+result);
    }
}
