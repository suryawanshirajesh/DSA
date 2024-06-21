package InsertionSort;

public class Insetionsortwithrecursion {
  public static void InsertionSortrecursion1(int[] arr, int n) {
    if (n>arr.length-1)
      return;
    int j = n;
    while (j > 0 && arr[j] > arr[j - 1]) {
      int temp = arr[j];
      arr[j] = arr[j - 1];
      arr[j - 1] = temp;
      j--;
    }
    InsertionSortrecursion1(arr, n+1);
  }

  public static void InsertionSortrecursion(int [] arr,int n){
   if(n<=0){
    return;
   }
   InsertionSortrecursion(arr, n-1);
   int j=n;
   while (j > 0 && arr[j] > arr[j - 1]) {
    int temp = arr[j];
    arr[j] = arr[j - 1];
    arr[j - 1] = temp;
    j--;
  }
  }


  public static void main(String[] args) {
    int[] arr = { 2, 44, 23, 39, 68, 15, 12 };
    int n=arr.length;
    //Insertionsort(arr);
    InsertionSortrecursion(arr,n-1);
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }
}
