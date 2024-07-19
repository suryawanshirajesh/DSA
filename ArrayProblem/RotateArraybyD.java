public class RotateArraybyD {
    public static void rotate(int [] nums,int D,int n){
     if(n==0){
        return;
     }
     D=D%n;
     if(D>n){
        return;
     }
     int [] temp = new int[D];

     for(int i=n-D;i<n;i++){
        temp[i-n+D]=nums[i];
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
        for (int i : nums) {
            System.out.print(i + ", ");
        }
    }
}
