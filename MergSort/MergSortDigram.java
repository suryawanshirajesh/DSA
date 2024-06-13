package MergSort;

import java.util.ArrayList;

public class MergSortDigram {

    public static void Merge(int[] arr, int low, int mid, int high) {
        System.out.println("Merging: low=" + low + ", mid=" + mid + ", high=" + high);
        ArrayList<Integer> lt = new ArrayList<>();
        int left = low;
        int right = mid + 1;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                lt.add(arr[left]);
                left++;
            } else {
                lt.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            lt.add(arr[left]);
            left++;
        }
        while (right <= high) {
            lt.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = lt.get(i - low);
        }

        // Print merged array
        System.out.print("Merged array: ");
        for (int i = low; i <= high; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void Ms(int[] arr, int low, int high) {
        int mid = (low + high) / 2;
        if (low >= high) {
            return;
        }

        System.out.println("Dividing: low=" + low + ", mid=" + mid + ", high=" + high);

        Ms(arr, low, mid);
        Ms(arr, mid + 1, high);
        Merge(arr, low, mid, high);
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 3, 2, 12, 10};
        System.out.print("Initial array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        Ms(arr, 0, arr.length - 1);

        System.out.print("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
