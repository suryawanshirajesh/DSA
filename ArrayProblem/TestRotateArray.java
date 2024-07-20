public class TestRotateArray {
    public static void rotate(int [] nums,int D,int n){
        if(n<=0){
        return;
        }
        D=D%n;
        if(D==0){
            return;
        }
        int temp [] = new int[D];
        for(int i=0;i<D;i++){
           temp[i]=nums[i];
        }
      for(int k=D;k<n;k++){
        nums[k-D]=nums[k];
      }
     for(int i=0;i<D;i++){
        nums[D+i]=temp[i];
     }
     for (int i : nums) {
            System.out.print(i + ", ");
        } 
    }
    public static void main(String[] args) {
        int n,D=3;
        int[] nums = { 3, 4, 5, 1, 22 };
        n=nums.length;
        rotate(nums,D,n);
        // for (int i : nums) {
        //     System.out.print(i + ", ");
        // } 
    }
}
