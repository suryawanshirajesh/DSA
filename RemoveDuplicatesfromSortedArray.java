
public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        int k = 0;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[k]) {
                k++;
                nums[k] = nums[i];
            }
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
        return k + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = removeDuplicates(nums);
        System.out.println("Result :" + result);
    }
}
