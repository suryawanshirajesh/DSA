//Given a binary array nums, return the maximum number of consecutive 1's in the array.

public class MaxConsicativeones {
    public static  int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int currentcount=0;
        for(int i=0;i<nums.length;i++){
          if(nums[i]==1){
              currentcount++;
          }else{
              currentcount=0;
          }
             if(max<currentcount){
                 max=currentcount;
             }
        
        }
       
        return max;
    }

    public static void main(String[] args) {
       int [] nums = {1,1,0,1,1,1};
      int result= findMaxConsecutiveOnes(nums);
      System.out.print("Max count is  :"+result);
    }
}
