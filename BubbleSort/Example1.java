package BubbleSort;

public class Example1 {

    public static int[] Sort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {

            for (int j = 0; j <= i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {45, 22, 89, 18, 90, 67, 12};
        int[] result = Sort(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
