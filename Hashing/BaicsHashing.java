
import java.util.*;

class BaicsHashing {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n;
            System.out.print("Enter the element");
            n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            //precompute:
            int[] hash = new int[13];
            for (int i = 0; i < n; i++) {
                System.out.println("Hash element is before hash " + hash[arr[i]] + " arr[i] " + arr[i]);
                hash[arr[i]] += 1;
                System.out.println("Hash element is after hash " + hash[arr[i]] + "arr[i] " + arr[i]);
            }

            int q;
            System.out.print("Enter the q elemtent");
            q = sc.nextInt();
            while (q-- != 0) {
                int number;
                System.out.print("Enter the number");
                number = sc.nextInt();
                // fetching:
                System.out.println(hash[number]);
            }
        }
    }
}
