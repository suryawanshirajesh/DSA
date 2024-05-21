
import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersdArray {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missingNumbers = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < n) {
                for (int k = 0; k < nums.length; k++) {
                    if (nums[i] != k) {
                        missingNumbers.add(k);
                    }
                }
            }
        }
        return missingNumbers;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result.toString());
    }

}
