public class MoveZero {
    public static void move(int [] arr){
     int j=-1;
     for(int i=0;i<arr.length;i++){
        if(arr[i]==0&&j==-1){
          j=i;
        }
        if(arr[i]==0&&j!=-1){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
     }
     for (int i : arr) {
        System.out.print(i+" ");
    }
    }
    public static void main(String[] args) {
        int [] arr={1,2,0,0,3,6,0,0,4,5,0};
        move(arr);
      
    }
}
