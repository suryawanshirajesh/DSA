package patterns;

public class Pattern15 {

    public static void main(String[] args) {
        int n = 5;
        int space = 0;
        
        // Upper part of the pattern
        for (int i = 0; i < n; i++) {
            // Stars on the left side
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 0; j < space; j++) {
                System.out.print(" ");
            }
            // Stars on the right side
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            space += 2;
            System.out.println();
        }
        
        int space2 = 8;
        
        // Lower part of the pattern
        for (int i = 1; i <= n; i++) {
            // Stars on the left side
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 0; j < space2; j++) {
                System.out.print(" ");
            }
            // Stars on the right side
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            space2 -= 2;
            System.out.println();
        }
    }
}
