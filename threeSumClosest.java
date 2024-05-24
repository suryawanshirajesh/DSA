
import java.util.*;

public class threeSumClosest {

    public static int threeSumCloseste(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int currentSum = nums[i] + nums[j] + nums[k];
                if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currentSum;
                }
                if (currentSum < target) {
                    j++;  // Increase the sum by moving the left pointer to the right
                } else if (currentSum > target) {
                    k--;  // Decrease the sum by moving the right pointer to the left
                } else {
                    return currentSum;  // If the exact target is found, return immediately
                }
            }
        }

        return closestSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int result = threeSumCloseste(nums, target);
        System.out.print("Result " + result);
    }
}
