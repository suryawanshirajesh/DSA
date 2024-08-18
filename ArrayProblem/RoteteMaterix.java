public class RoteteMaterix {
    public static void rotate(int [][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
              int temp=arr[i][j];
              arr[i][j]=arr[i][arr.length-1-j];
              arr[i][arr.length-1-j]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        for (int[] is : arr) {
            for (int is2 : is) {
                System.out.print(is2);
            }
            System.out.println();
        }
    }
}
