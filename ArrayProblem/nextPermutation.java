public class nextPermutation {
    public static void find(int[] arr) {
        int k = -1;
        // Step 1: Find the largest index k such that arr[k] < arr[k + 1]
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                k = i;
                break;
            }
        }

        // Step 2: If no such index exists, the permutation is the last permutation, so reverse it.
        if (k == -1) {
            reverse(arr, 0, arr.length - 1);
            return;
        }

        // Step 3: Find the largest index l greater than k such that arr[k] < arr[l]
        for (int i = arr.length - 1; i > k; i--) {
            if (arr[i] > arr[k]) {
                // Step 4: Swap arr[k] with arr[l]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                break;
            }
        }

        // Step 5: Reverse the sequence from k+1 to the end
        reverse(arr, k + 1, arr.length - 1);
    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1};
        find(nums);

        // Print the result to verify
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
