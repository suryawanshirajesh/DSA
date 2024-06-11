package SelectionSort;

public class Selectionsortalgo {

    public static int[] Sort(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {

            int min = i;

            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 22, 3, 68, 46, 78, 15};
        int[] reult = Sort(arr);
        for (int i : reult) {
            System.out.print(i + " ");
        }
    }
}
