public class sortColors {
   
    public static void find(int arr[]){
        int count0=0;
        int count1=0;
        int count2=0;
       for(int i=0;i<arr.length;i++){
        if(arr[i]==0) count0++;
        if(arr[i]==1)count1++;
        if(arr[i]==2) count2++;
       }
       for(int i=0;i<count0;i++){
        arr[i]=0;
       }
       for(int i=count0;i<count0+count1;i++){
        arr[i]=1;
       }
       for(int i=count0+count1;i<arr.length;i++){
        arr[i]=2;
       }
       for (int i : arr) {
        System.out.print(i+" ,");
       }

    }

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
         int[] color= {1, 2, 0, 0, 1,1,1,2};
         sort(color);
         find(color);
        //  for (int i : color) {
        //     System.out.print(i+" ,");
        //  }
    }
}
