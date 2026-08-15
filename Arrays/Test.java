public class Test{
       //Time to equality
       public static int Timeequality(int [] arr){
        int time=0;
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            time += (max-arr[i]);
        }
        return  time;
       }
      //Array Rotation
       public static void reverse(int [] arr,int si,int ei){
        while(si<ei){
         int temp  = arr[si];
         arr[si]=arr[ei];
         arr[ei]=temp;
         si++;
         ei--;
        }
       }
       public static void RotationArray(int [] arr,int k){
         int N = arr.length;
         k = k%N;
        reverse(arr, 0, N-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, N-1);

        for(int n:arr){
            System.out.print(n+" ");
        }
       }
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
           int [] arr = {1,2,3,4};
           int k=2;
           RotationArray(arr,k);
        // int [] arr ={1,2,3,4};
        // int B=6;
        // int result =GoodPair(arr, B);
        // System.out.print(result);
    }
}