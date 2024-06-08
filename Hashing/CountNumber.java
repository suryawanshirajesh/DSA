
import java.util.*;

public class CountNumber {

    public static void Count(int arr[]) {
        Arrays.sort(arr);
        int count = 1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " : " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " : " + count);
    }

    public static void frequencyCount(int arr[], int N) {
        Map<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < N; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            System.out.println(entry.getKey() + " :" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 6, 4, 6, 1};
        int N = arr.length;
        frequencyCount(arr, N);
        // Count(arr);
    }
}
