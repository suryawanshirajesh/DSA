class Largestelement{
    public static int largeelement(int [] num){ 
        int k=num[0];
        int large=0;
        for(int i=0;i<num.length;i++){
           if(k<num[i]){
           k=num[i];
           }
        }
        System.out.println(k);
        return large;
    }

    public static void main(String[] args){
          int [] nums = {5,2,7,23,89,4};
          largeelement(nums);
    }
}