public class singleNumberoptimal {
    public static int getSingleElement(int [] arr){
        int Xor=0;
        for(int i=0;i<arr.length;i++){
            Xor=Xor^arr[i];
        }
        return Xor;
    }
    public static void main(String[] args) {
        int[] arr = {4, 4,7,1, 2, 1, 2,7,5};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}
