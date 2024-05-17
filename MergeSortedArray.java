
public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // Start from the end of both arrays
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        // While there are elements to compare in both arrays
        while (p1 >= 0 && p2 >= 0) {
            // Place the larger element at the end of nums1
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        // If there are remaining elements in nums2, copy them
        // No need to copy remaining elements of nums1 because they are already in place
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        merge(nums1, m, nums2, n);

        // Print the merged array
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }
}
