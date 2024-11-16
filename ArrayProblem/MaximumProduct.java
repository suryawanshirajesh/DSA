public class MaximumProduct {
    public static int Maximumproducts(int [] arr){
        int pre = 1, suff = 1;
        int ans= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(pre==0)pre=1;
            if(suff==0)suff=1;
            pre*=arr[i];
            suff*=arr[arr.length-i-1];
            ans=Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
    public static void main(String[] args) {
      int []  Nums = {1,2,3,4,5,0};
      int result=Maximumproducts(Nums);
      System.out.print("Max Product : "+ result);
    }
}
