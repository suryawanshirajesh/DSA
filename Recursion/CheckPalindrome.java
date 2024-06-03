package Recursion;

public class CheckPalindrome {

    public static boolean check(int n, String s) {
        // Base case: if the current index reaches the middle, the string is a palindrome
        if (n >= s.length() / 2) {
            return true;
        }
        // Check if characters at current index and its corresponding index from the end are not equal
        if (s.charAt(n) != s.charAt(s.length() - n - 1)) {
            return false;
        }
        // Recursive case: check the next pair of characters
        return check(n + 1, s);
    }

    public static void main(String[] args) {
        String st = "MADAM";
        int n = 0;
        boolean result = check(n, st);
        System.out.print("Result: " + result);
    }
}
