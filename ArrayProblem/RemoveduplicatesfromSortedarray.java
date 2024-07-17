public class RemoveduplicatesfromSortedarray {
    public static int checkduplicate(int []arr){
       int i=0;
       for(int j=1;j<arr.length;j++){
        if(arr[j]!=arr[i]){
          arr[i+1]=arr[j];
          i++;
        }
       }
        return i+1;
    }
    public static void main(String[] args) {
        int [] nums = {3,4,4,5,5,1,2,2};
        int result=checkduplicate(nums);
        System.out.println("Result : "+result);
    }
}
