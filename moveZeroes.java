
class moveZeroes {

    public static void moveZeroe(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        for (int k = nonZeroIndex; k < nums.length; k++) {
            nums[k] = 0;
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroe(nums);
    }
}
