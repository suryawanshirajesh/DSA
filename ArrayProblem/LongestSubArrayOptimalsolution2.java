import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayOptimalsolution2 {
    public static int getLongestSubarray(int [] arr,int k){
        int n=arr.length;
        int maxlength=0;
        int sum=0;
        Map<Integer,Integer> list = new HashMap<>();
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxlength=Math.max(maxlength,i+1);
            }

            int rem = sum-k;
            if (list.containsKey(rem)) {
                int len = i - list.get(rem);
                maxlength = Math.max(maxlength, len);
            }

            if (!list.containsKey(sum)) {
                list.put(sum, i);
            }
        }

        return maxlength;
    }
    public static void main(String[] args) {
        int[] a = { -1, 1, 1};
        int k = 1;
        int len = getLongestSubarray(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
