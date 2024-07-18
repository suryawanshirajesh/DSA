public class LeftRotateanarraybyoneplace {
    public static void rotate(int [] arr){
    
        int i=arr[0];
        for(int j=1;j<arr.length;j++){
            arr[j-1]=arr[j];
        }
        arr[arr.length-1]=i;
    }
    public static void main(String[] args) {
         int [] nums = {3,4,5,1,2};
        rotate(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
