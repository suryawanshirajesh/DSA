
public class CountNumber {

    public static void frequencyCount(int arr[], int N, int P) {

        for (int i = 0; i < N; i++) {

            for (int j = 1; j < N; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 4, 6, 4, 6, 1};
        int N = arr.length;
        int P = 1;
        frequencyCount(arr, N, P);
    }
}
