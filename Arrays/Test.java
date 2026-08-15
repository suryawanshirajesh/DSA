public class Test{
      //Good Pair
      public static int GoodPair(int [] arr,int B){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==B){
                    return 1;
                }
            }
        }
        return  0;
      }
    public static void main(String [] args){
        int [] arr ={1,2,3,4};
        int B=6;
        int result =GoodPair(arr, B);
        System.out.print(result);
    }
}