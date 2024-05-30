package Recursion;

public class Printntimeusingbacktracking {

    public static void printntime(int i, int n) {
        if (i < 1) {

            return;
        }
        printntime(i - 1, n);
        System.out.print("Raj" + i);
    }

    public static void main(String[] args) {
        int n = 5;
        int i = 3;
        printntime(i, n);
    }
}
