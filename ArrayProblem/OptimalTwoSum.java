import java.util.HashMap;
import java.util.Map;

public class OptimalTwoSum {

    public static int [] find(int []arr,int n,int target){
        int value=0;
        Map<Integer,Integer> list = new HashMap<>();
        for(int i=0;i<n;i++){
           value=target-arr[i];
           if(list.containsKey(value)){
            return new int[]{list.get(value),i};
           }

           list.put(arr[i],i);
        };
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {2, 6, 5, 8, 11};
        int target = 13;
        int[] result = find(arr, n, target);
        if (result[0] == -1) {
            System.out.println("No solution found");
        } else {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
    }
}
