
public class ValidMountainArray {

    public static boolean validMountainArrays(int[] arr) {
        if (arr.length < 3) {
            return false;
        }
        int i = 0;
        while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
            i++;
        }
        if (i == 0 || i == arr.length - 1) {
            return false;
        }
        while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
            i++;
        }

        return i == arr.length - 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 1};
        boolean result = validMountainArrays(arr);
        System.out.println(result);
    }

}
