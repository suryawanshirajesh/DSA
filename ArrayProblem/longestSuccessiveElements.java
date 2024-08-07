import java.util.HashSet;
import java.util.Set;

public class longestSuccessiveElements {
    public static int longestSuccessiveElementcount(int arr[]){
        int n=arr.length;
        int count=0;
        int max=0;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
     
            
        
        return count;
    }
    public static void main(String[] args) {
        int [] arr={100, 200, 1, 3, 2, 4};
        int result = longestSuccessiveElementcount(arr);
        System.out.print("Result : "+result);
    }
}
