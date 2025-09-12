

public class FindSqureroot {
        public static long floorSqrt(long n) {
            int ans=1;
            long low=1,high=n;
            while(low<=high){
                int mid = (int) ((low+high)/2);
                 if(mid*mid<=n){
                   ans=mid;
                   low=mid+1;
                 } else{
                      high=mid-1;
                 }    
            }

        return ans;
    }

    public static void main(String[] args) {
        long n = 37;
           int ans = (int) floorSqrt(n);
           System.out.println(ans);
    }
}
