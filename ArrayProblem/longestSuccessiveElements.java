import java.util.HashSet;
import java.util.Set;

public class longestSuccessiveElements {
    public static int longestSuccessiveElementcount(int arr[]){
        int n=arr.length;
        int longest=1;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
       
        for(int it:set){

            if(!set.contains(it-1)){
                int count=1;
                 int x=it;
                 if(set.contains(x+1)){
                    x=x+1;
                    count = count+1;
                 }
                 longest = Math.max(count, longest);

            }
        }
            
        
        return longest;
    }
    public static void main(String[] args) {
        int [] arr={100, 200, 1, 3, 2, 4};
        int result = longestSuccessiveElementcount(arr);
        System.out.print("Result : "+result);
    }
}
