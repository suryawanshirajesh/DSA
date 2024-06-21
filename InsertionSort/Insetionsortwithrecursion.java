package InsertionSort;

public class Insetionsortwithrecursion {
    
    public static void Insertionsort(int [] arr){
      for(int i=0;i<arr.length;i++){
        int j=i;
        while (j>0&&arr[j]>arr[j-1]) {
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;
        }
      }
    }
    public static void main(String[] args) {
        int[] arr = {2, 44, 23, 39, 68, 15, 12};
        Insertionsort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
