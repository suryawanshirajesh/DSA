public class TwoSum {
    
    public static void main(String [] args){
         int [] arr = {2,7,4,3};
         int target =9;
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                   if(arr[i]+arr[j]==target){
                    System.out.println("Index is "+i+" "+j);
                   }
            }
         }
    }
}
