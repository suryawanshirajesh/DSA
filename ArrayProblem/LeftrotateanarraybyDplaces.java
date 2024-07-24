public class LeftrotateanarraybyDplaces {
    public static void rotate(int [] arr, int D){
        int n=arr.length;
        if(n<0){
            return ;
        }
        
      for(int j=D;j<arr.length;j++){
        
      }
    }
    public static void main(String[] args) {
        int D=3;
        int [] nums = {3,4,5,1,2};
        rotate(nums,D);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
