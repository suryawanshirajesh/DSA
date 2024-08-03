public class MajorityElement {
    public static int find(int [] arr){
    int count=0,max=0,number=0;
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
            if(max<count){
                max=count;
               number=arr[i];
            }
        }
        count=0;
     }
     System.out.print("Result : "+number);
     return number;
    }
    public static void main(String[] args) {
      // int [] nums = {2,2,1,1,1,2,2,1,1,2,1,2,1};
      int [] nums={3,3,4};
       find(nums);

    }
}
