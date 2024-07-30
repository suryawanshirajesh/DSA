public class singleNumber {
    public static int getSingleElement(int [] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]){
                count++;
            }
          }
          if(count==1){
            count=arr[i];
            return count;
          }
          count=0;
        }
       return count;
    }
    public static void main(String[] args) {
        int[] arr = {4, 4,7,1, 2, 1, 2,7,5};
        int ans = getSingleElement(arr);
        System.out.println("The single element is: " + ans);
    }
}
