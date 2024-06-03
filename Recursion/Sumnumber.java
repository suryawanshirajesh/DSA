package Recursion;

public class Sumnumber {

    public static int Sum(int i) {

        if (i <= 0) {
            return i;
        }
        return i + Sum(i - 1);
    }

    public static void main(String[] args) {
        int number = 5;
        int result = Sum(number);
        System.out.println("Result " + result);
    }
}
