package BasicMath;

public class Armstrongnumbers {

    public static void main(String[] args) {
        int n = 153;
        int duplicate = n;
        int number = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            int Cubeonumber = (lastdigit * lastdigit * lastdigit);
            number += Cubeonumber;
            n = n / 10;
        }

        if (duplicate == number) {
            System.out.println("This Armstrong Number");
        } else {
            System.out.println("This not Armstrong Number");
        }
    }
}
