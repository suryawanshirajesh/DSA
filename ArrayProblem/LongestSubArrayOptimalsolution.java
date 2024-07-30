public class LongestSubArrayOptimalsolution {
    public static int subarray(int [] a,int k){
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int [] arr={10, 5, 2, 7, 1, 9};
        int k=15;
        int result=subarray(arr, k);
        System.out.println("Result : "+ result);
    }
}
