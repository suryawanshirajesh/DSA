
public class ReplaceElementswithGreatestElementRightSide {

    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int gretest = -1;
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            arr[i] = gretest;
            if (current > gretest) {
                gretest = current;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] result = replaceElements(arr);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
