
import java.util.Arrays;

public class HeightChecker {

    public static int heightChecker(int[] heights) {
        int count = 0;
        int[] sorted = Arrays.copyOf(heights, heights.length);
        for (int i = 0; i < sorted.length; i++) {
            for (int k = 0; k < sorted.length; k++) {
                if (sorted[i] < sorted[k]) {
                    int temp = sorted[k];
                    sorted[k] = sorted[i];
                    sorted[i] = temp;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1, 1, 4, 2, 1, 3};
        int result = heightChecker(heights);
        System.out.println("rsult" + result);
    }
}
