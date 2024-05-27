package patterns;

public class Pattern13 {

    public static void main(String[] args) {
        int n = 6;
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch < 'A' + n - i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
