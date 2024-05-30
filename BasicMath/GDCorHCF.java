package BasicMath;

public class GDCorHCF {

    public static int HCF(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static void main(String[] args) {
        int a = 15;
        int b = 5;
        int result = HCF(a, b);
        System.out.println(result);

    }
}
