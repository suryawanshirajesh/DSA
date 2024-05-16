
public class DuplicateZeros {

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;

        int i = 0;

        while (i < n) {
            if (arr[i] == 0) {
                for (int j = n - 1; j > i; i--) {
                    arr[j] = arr[j - 1];
                }
                if (i + 1 < n) {
                    arr[i + 1] = 0;
                }
                i += 2;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 5};
        duplicateZeros(arr);
    }
}
