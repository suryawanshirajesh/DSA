
//import java.util.Arrays;
import java.util.*;

/**
 * ThreeSumTriplate
 */
public class ThreeSumTriplate {

    public Set<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ls = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> t = Arrays.asList(nums[i], nums[j], nums[k]);
                    ls.add(t);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                }
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        ThreeSumTriplate ts = new ThreeSumTriplate();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        Set<List<Integer>> result = ts.threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet + " ");
        }
    }

}
