package Recursion;

public class FactorialusingFuntionalrecursion {

    public static int Fact(int n) {
        if (n == 0) {
            return 0;
        }
        return n * Fact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        int result = Fact(n);
        System.out.println(result);
    }
}
}
