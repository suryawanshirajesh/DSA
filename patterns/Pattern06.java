package patterns;

public class Pattern06 {

    public static void main(String[] args) {
        for (int i = 0; i <= 6; i++) {
            for (int j = 0; j < 6 - i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
