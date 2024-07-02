public class sortdemo {
    public static void Quicksort(int [] arr, int low, int high){
        if(low<high){

            int pivotIndex = partition(arr,low,high);
            
            Quicksort(arr, low, pivotIndex-1);
            Quicksort(arr, pivotIndex+1, high);
        }
    }
    public static int partition(int []arr,int low,int high){
        int piovt = arr[high];
        int i = low-1;
        for(int j=low;j<high;j++){
           if(arr[j]<=piovt){
             i++;
            int temp = arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
           }
        }
        int temp = arr[i+1];
        arr[i+1]= arr[high];
        arr[high]=temp;

        return i+1;
    }
    public static void main(String[] args) {
          int[] array = {10, 7, 8, 9, 1, 5};
        int n = array.length;

        System.out.println("Unsorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        Quicksort(array, 0, n - 1);

        System.out.println("\nSorted array:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
