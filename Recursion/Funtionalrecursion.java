package Recursion;

public class Funtionalrecursion {

    public static int Sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = Sum(n);
        System.out.println(result);
    }
}
