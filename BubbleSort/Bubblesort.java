package BubbleSort;

public class Bubblesort {

    public static int[] Sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    ;
    public static void main(String[] args) {
        int[] arr = {1, 55, 14, 2, 98, 26};
        int[] result = Sort(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
