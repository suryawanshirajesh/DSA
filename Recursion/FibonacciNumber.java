package Recursion;

public class FibonacciNumber {

    public static int fibonaccicheck(int n) {
        if (n <= 1) {
            return n;
        }
        int last = fibonaccicheck(n - 1);
        int slast = fibonaccicheck(n - 2);
        return last + slast;
    }

    public static void main(String[] args) {
        int i = 10;
        int result = fibonaccicheck(i);
        System.out.println("Result :" + result);
    }
}
