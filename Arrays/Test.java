public class Test{

         //Range Sum Query
         public static int [] RangeSum(int []arr,int [][]query){
            int Q = query.length;
            int N = arr.length;
            int [] ans = new int[Q];
            int [] prefixsum = new int[N];
            prefixsum[0]=arr[0];
            for(int i=1;i<N;i++){
               prefixsum[i]=prefixsum[i-1]+arr[i];
            }

            for(int i=0;i<Q;i++){
                int left = query[i][0];
                int right = query[i][1];
                int sum=0;
                if(left==0){
                 sum = prefixsum[right];
                }else{
                    sum = prefixsum[right]-prefixsum[left-1];
                }
                ans[i]=sum;
            }
            return ans;
         }

        // Count of elements
        public static int Countelements(int [] arr){
            int element=0;int max= arr[0];
            for(int n:arr){
                if(n>max){
                    max=n;
                }
            }
            for(int i=0;i<arr.length;i++){
                if(arr[i]<max){
                    element++;
                }
            }
            return element;
        }
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
          int [] arr ={1,2,3,4,5};
          int [][] query = {{0,3},{2,3}};
          int [] result = RangeSum(arr, query);
          for(int n:result){
            System.out.println(n);
          }

        //    int [] arr = {1,2,3,4};
        //    int k=2;
        //    RotationArray(arr,k);


        // int [] arr ={1,2,3,4};
        // int B=6;
        // int result =GoodPair(arr, B);
        // System.out.print(result);
    }
}