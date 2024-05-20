
public class SortArrayByParity {

    public static int[] sortArrayByParitys(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                for (int k = i; k < nums.length; k++) {
                    if (nums[k] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[k];
                        nums[k] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
        int[] result = sortArrayByParitys(nums);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

