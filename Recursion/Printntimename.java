package Recursion;

public class Printntimename {

    public static void printntime(int i, int n) {
        System.out.print("GFG" + " ");
        i++;
        if (i > n) {
            return;
        }
        printntime(i, n);
    }

    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        printntime(i, n);
    }
}
