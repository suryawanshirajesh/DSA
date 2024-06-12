package SelectionSort;

public class Example1 {

    public static int[] Sortdesc(int[] arr) {
        for (int i = 0; i <= arr.length - 2; i++) {
            int max = i;

            for (int j = i; j <= arr.length - 1; j++) {

                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {29, 10, 14, 37, 14};
        int[] result = Sortdesc(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
