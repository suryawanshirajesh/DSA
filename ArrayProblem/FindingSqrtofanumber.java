public class FindingSqrtofanumber {
    public static int SqrtFind(int number){
       int ans=1;
       int low=1,high=number;
       while(low<=high){
        int mid=(low+high)/2;
        if((mid*mid)<=number){
            ans=mid;
            low=mid+1;
        }else{
            high=mid-1;
        }
       }
       return ans;
    }
    public static void main(String[] args) {
        int n=28;
        int result= SqrtFind(n);
        System.out.println("Result : "+ result);
    }
}
