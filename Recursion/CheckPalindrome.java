package Recursion;

public class CheckPalindrome {

    public static boolean check(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return check(0, s);
    }

    public static boolean check(int n, String s) {
        if (n >= s.length() / 2) {
            return true;
        }
        if (s.charAt(n) != s.charAt(s.length() - n - 1)) {
            return false;
        }
        return check(n + 1, s);
    }

    public static void main(String[] args) {
        String st = "MADAM";
        // int n = 0;
        boolean result = check(st);
        System.out.print("Result: " + result);
    }
}
