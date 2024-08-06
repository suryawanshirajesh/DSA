public class OptimalsortColors {
    public static void sort(int [] arr){
     int left=arr.length-1,right=0;
     while (right<left) {
        if(arr[right]>arr[left]){
            int temp=arr[right];
            arr[right]=arr[left];
            arr[left]=temp;
            right++;
            left--;
        }
        if(arr[right]<=arr[left]){
            right++;
        }
     }
    }
    public static void main(String[] args) {
         int[] color= {1, 2, 0, 0, 1};
         sort(color);
         for (int i : color) {
            System.out.print(i+" ,");
         }
    }
}
