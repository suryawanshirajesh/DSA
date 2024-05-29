package BasicMath;

public class Reversenumber {

    public static void main(String[] args) {
        int n = 1534236469;
        int reverse = 0;
        int sign = (n < 0) ? -1 : 1;
        n = Math.abs(n);

        while (n > 0) {
            int lastdigit = n % 10;

            // Check for overflow before updating reverse
            if (reverse > (Integer.MAX_VALUE - lastdigit) / 10) {
                reverse = 0;
                break;
            }

            reverse = (reverse * 10) + lastdigit;
            n = n / 10;
        }

        reverse *= sign;
        System.out.println("Reversed Number: " + reverse);
    }
}
