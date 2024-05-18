
public class Removeelement {

    public static int removeElement(int[] nums, int val) {
        int K = 0; //this is pointer
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[K] = nums[i];
                K++;
            }
        }

        return K;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        int result = removeElement(nums, val);
        System.out.println("Result :" + result);

    }
}
