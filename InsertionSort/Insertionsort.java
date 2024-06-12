package InsertionSort;

public class Insertionsort {

    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 44, 23, 39, 68, 15, 12};
        Sort(arr);
    }
}
