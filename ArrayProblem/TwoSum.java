public class TwoSum {
    public static int[] two(int n, int[] arr, int target) {
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] + arr[i] == target) {
                return new int[]{i - 1, i};
            }
        }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 14;
        int[] result = two(n, arr, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
