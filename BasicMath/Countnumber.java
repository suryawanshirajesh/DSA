package BasicMath;

public class Countnumber {

    public static void main(String[] args) {
        int n = 1246;
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println("Count : " + count);
    }
}
