public class MaxConsecutiveOnes {
    public static void Consecutive(int [] arr){
        int currentcount=0;
        int privous=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                currentcount+=1;
            }else{
                privous=currentcount;
                currentcount=0;
            }
            if(privous<currentcount){
                privous=currentcount;
            }
            
        }

        System.out.println("Result : "+privous);
        
    }
    public static void main(String[] args) {
         int nums[] = { 1, 1, 0, 1, 1, 1 ,0,1};
         Consecutive(nums);
    }
}
