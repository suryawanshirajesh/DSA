
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            twoSum(-nums[i], nums, i + 1, result);
        }
        return result;
    }

    private static void twoSum(int target, int[] nums, int startIndex, List<List<Integer>> result) {
        int i = startIndex;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < target) {
                i++;
                continue;
            }
            if (nums[i] + nums[j] > target) {
                j--;
                continue;
            }
            result.add(Arrays.asList(-target, nums[i], nums[j]));
            i++;
            j--;
            while (j > i && nums[j] == nums[j + 1]) {
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ls = threeSum(nums);
        for (List<Integer> list : ls) {
            System.out.println(list + " ");
        }
    }
}
