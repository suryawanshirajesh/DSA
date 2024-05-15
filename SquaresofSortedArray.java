/**
 * SquaresofSortedArray
 */
public class SquaresofSortedArray {

    public static  int[] sortedSquares(int[] nums) {
          int [] result=new int [nums.length];
           result[0]=0;
          for(int i=0;i<nums.length;i++){
              int square = nums[i]*nums[i];
              if(result[i]>square){
                int temp = square;
                square=result[i];
                result[i]=temp;
              }
          }
          return  result;
    }
    public static void main(String[] args) {
        int [] nums = {-1,2,16,4,3};
        int [] result = sortedSquares(nums);
        for (int i : result) {
            System.out.println(result);
        }
    }
    
}