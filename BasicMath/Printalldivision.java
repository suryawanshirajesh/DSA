package BasicMath;

import java.util.*;

public class Printalldivision {

    //but using this we the time complexivity is O(n)
    // public static void main(String[] args) {
    //     int n = 36;
    //     for (int i = 1; i <= n; i++) {
    //         if (n % i == 0) {
    //             System.out.print( i + " ");
    //         }
    //     }
    // }
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        int n = 36;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                ls.add(i);
                if (n / i != i) {
                    ls.add(n / i);
                }
            }
        }
        Collections.sort(ls);
        for (Integer elem : ls) {
            System.out.print(elem + " ");
        }
    }

}
