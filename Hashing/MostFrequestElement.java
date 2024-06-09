
import java.util.*;

public class MostFrequestElement {

    public static int maxFrequency(int[] nums, int length) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (hash.containsKey(nums[i])) {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            } else {
                hash.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        int maxFreq = 0, minFreq = length;
        int maxEle = 0, minEle = 0;

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();
            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 5, 8, 8, 6, 7};
        int length = arr.length;
        maxFrequency(arr, length);

    }
}
