
public class ThirdMaximumNumber {

    public static int thirdMax(int[] nums) {
        //int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[i + 1]) {

            }

        }
        return 0;
    }

    public static void main(String[] args) {
        // int[] nums = {3, 2, 1};
        int[] nums = {2, 2, 3, 1};
        int result = thirdMax(nums);
        System.out.println("Result" + result);
    }
}
