package patterns;

public class Pattern16 {

    public static void main(String[] args) {
        int n = 5;
        int space = 2 * n - 1;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            //star
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                space -= 2;
            } else {
                space += 2;
            }
        }
    }
}
