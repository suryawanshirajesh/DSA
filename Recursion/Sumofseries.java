package Recursion;

public class Sumofseries {

    public static long sumOfSeries(long n) {
        // code here
        if (n == 1) {
            return 1;
        }
        return n * n * n + sumOfSeries(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        long result = sumOfSeries(number);
        System.out.println("Result :" + result);
    }
}
