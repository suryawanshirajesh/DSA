package LeetCode;

public class IncreasingTriplet {

    public static boolean increasingTriplet(int[] nums) {
        boolean result = false;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = j + 1;
            if (nums[i] < nums[j] && nums[j] < nums[k]) {
                return true;
            }
        }
        return result;
    }

    ;

    
    public static void main(String[] args) {
        //int[] nums = {1, 2, 3, 4, 5};
        int[] nums = {5, 4, 3, 2, 1};
        //int[] nums = {2, 1, 5, 0, 4, 6};
        boolean result = increasingTriplet(nums);
        System.out.println("Result : " + result);
    }
}
