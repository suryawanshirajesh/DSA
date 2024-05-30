package BasicMath;

public class Checkprimenumber {

    public static void main(String[] args) {
        int n = 24;
        int count = 0;
        //In this case the Big O is O(sqrt(n))
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }
        if (count <= 2) {
            System.out.println("This is Prime Number");
        } else {
            System.out.println("This is Not Prime Number");
        }

        //by using this big O is O(n) we can also find out by squar root
        // for (int i = 1; i <= n; i++) {
        //     if (n % i == 0) {
        //         count++;
        //     }
        // }
        // if (count <= 2) {
        //     System.out.println("This is Prime Number");
        // } else {
        //     System.out.println("This is Not Prime Number");
        // }
    }
}
