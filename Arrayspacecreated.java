
public class Arrayspacecreated {

    public static void main(String[] args) {
        // Declare an integer array of 6 elements
        int[] intArray = new int[6];
        int length = 0;

// Add 3 elements to the Array
        for (int i = 0; i < 3; i++) {
            intArray[length] = i;
            length++;
        }
        intArray[length] = 10;
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        for (int i = 3; i >= 0; i--) {
            intArray[i + 1] = intArray[i];
        }
        intArray[0] = 20;
        System.out.println();
        for (int i : intArray) {
            System.out.print(i + " ");
        }
        for (int i = 4; i >= 2; i--) {
            intArray[i + 1] = intArray[i];
        }
        intArray[2] = 30;
        System.out.println();
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
