package Recursion;

public class ReversArray {

    public static void Revers(int start, int[] array, int end) {
        if (start >= end / 2) {
            return;
        }
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;

        Revers(start + 1, array, end - 1);

    };

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 3, 4, 7};
        int n = arr.length - 1;
        Revers(0, arr, n);
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
    };
}
