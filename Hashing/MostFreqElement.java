
import java.util.Arrays;

public class MostFreqElement {

    public static int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        long total = 0;
        int maxFreq = 0;

        for (int right = 0; right < nums.length; right++) {
            total += nums[right];

            while ((long) nums[right] * (right - left + 1) - total > k) {
                total -= nums[left];
                left++;
            }

            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 6};
        int k = 5;
        int result = maxFrequency(arr, k);
        System.out.print("Result : " + result);
    }
}
