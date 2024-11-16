public class FindingMissingAndRepetativenumber {
    public static int[] findMissingRepeatingNumbers(int[] a) {
     
        int n=a.length;
        //sum of first n natural number
        long Sn= (n * (n + 1)) / 2;
        long S2n=(n*(n+1))*(2*n+1)/6;
        long s=0,s2=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
            s2+=(long) a[i]* (long)a[i];
        }
        //Eqution s-sn = X-Y
        long val1 = s-Sn;
          // S2-S2n = X^2-Y^2:
        long val2 = s2-S2n;

        val2=val2/val1;
        long x= (val1+val2)/2;
        long y= x-val1;


        int[] ans = {(int)x, (int)y};
        return ans;
    }
    public static void main(String[] args) {
       int   arr [] = {3,1,2,5,3};
       int [] result= findMissingRepeatingNumbers(arr);
       for (int i : result) {
        System.out.print("Result :"+ i);
       }
    }
}
