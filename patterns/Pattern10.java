package patterns;

public class Pattern10 {

    public static void main(String[] args) {
        int n = 5;
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //number4
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
            space = space - 2;
        }
    }
}
