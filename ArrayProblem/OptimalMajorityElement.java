public class OptimalMajorityElement {
    public static int find(int [] arr){
        int count=0;
        int element=0;
      for(int i=0;i<arr.length;i++){
        if(count==0){
            element=arr[i];
            count=1;
        }else if(element==arr[i])count++;
        else count--;
      }
      int count1=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]==element)count1++;
      }
      if(count1>(arr.length/2)){
        return element;
      }
    return -1;
    }
    public static void main(String[] args) {
        int[] nums = { 3, 3, 4 };
        int reulst = find(nums);
        System.out.print("Result : " + reulst);
    }
}
