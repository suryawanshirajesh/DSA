package Recursion;

public class Printntimes {

    public static void display(int n) {

        System.out.print(n + " ");

        if (n > 11) {
            return;
        }
        n++;
        display(n);

    }

    public static void main(String[] args) {
        int n = 5;
        display(n);
    }
}
