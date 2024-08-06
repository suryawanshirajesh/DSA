import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {

   public static int find(int [] arr){
     int n=arr.length;
     if(n==0)return 0;
     int longest=0;
     Set<Integer> set = new HashSet<>();

     for(int i=0;i<n;i++){
        set.add(arr[i]);
     }
     
     for(int it:set){
        if(!set.contains(it-1)){
            int count=1;
            int x=it;
            while(set.contains(x+1)){
              x=x+1;
              count=count+1;
            }
            longest=Math.max(count, longest);
        }
     }

     return longest;
   }
   public static void main(String[] args) {
     int arr[] = {16,17,4,3,5,2};
     int result=find(arr);
     System.out.println("Result : "+result);
     for (int i : arr) {
        System.out.print(i+" ");
     }
   } 
}
