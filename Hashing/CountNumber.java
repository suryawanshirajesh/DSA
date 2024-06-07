
import java.util.*;

public class CountNumber {

    public static void Count(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            int count = 1;
            if (arr[1 - i] == arr[i]) {
                count++;
            } else {
                System.out.print(arr[1 - i] + " : " + count);
                count = 1;
            }
        }
    }
    // public static void frequencyCount(int arr[], int N, int P) {
    //     int count=0;
    //     for (int i = 0; i < N; i++) {
    //         if(arr[i]!=arr[i-1]){
    //             count++;
    //         }
    //     }
    //     for (int i : arr) {
    //         System.out.print(i + " ");
    //     }
    // }

    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 6, 4, 6, 1};
        int N = arr.length;
        int P = 1;
        // frequencyCount(arr, N, P);
        Count(arr);
    }
}
