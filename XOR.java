

public class XOR {

    public static int duplicateNumbersXOR(int[] nums) {

        int xor = 0;

        for (int num : nums) {
            xor ^= num; // XOR all elements
        }

        return xor;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3};
        int result = duplicateNumbersXOR(nums);
        System.out.print(result);
    }

}
