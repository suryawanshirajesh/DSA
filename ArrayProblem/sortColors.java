public class sortColors {
    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
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
