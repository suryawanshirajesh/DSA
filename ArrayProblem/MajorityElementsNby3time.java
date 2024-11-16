public class MajorityElementsNby3time {
    public static void check(int arr []) {
        int element1=0,element2=0,count1=0,count2=0;

        for(int i=0;i<arr.length;i++){

            if(count1==0 && element2!=arr[i]){
                element1=arr[i];
                count1=1;
            }else if(count2==0&& element1!=arr[i]){
                element2=arr[i];
                count2=1;
            }else if(element1==arr[i]){
                count1++;
            }else if(element2==arr[i]){
                count2++;
            }else{
                count1--;count2--;
            }
        }
        System.out.println("element 1 : "+element1+" "+"element 2 : "+element2);
    }
    public static void main(String[] args) {
        int [] arr = {11,33,33,11,33,11};
        check(arr);
    }
}
