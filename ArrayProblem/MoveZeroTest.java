public class MoveZeroTest {
    public static int[] moveZeroes(int [] arr){
        int j=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
             j=i;
             break;
            }
        }
        if(j==-1){ return arr;}
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for (int i : arr) {
            System.out.print(i+", ");
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] nums = { 3, 4, 0,0,5, 1,0,0, 22 };
        moveZeroes(nums);
    }
}
