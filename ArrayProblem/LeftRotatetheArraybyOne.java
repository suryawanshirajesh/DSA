public class LeftRotatetheArraybyOne {
    public static void rotate(int[] nums) {
        int temp=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
    }
    public static void main(String[] args) {
        int [] nums = {3,4,5,1,22};
        rotate(nums);
        for (int i : nums) {
            System.out.print(i+", ");
        }
    }
}
