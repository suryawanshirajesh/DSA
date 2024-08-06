import java.util.*;
public class BetterMajorityElement {
    public static int find(int arr[]){
        Map<Integer,Integer> list = new HashMap<>();
        for(int i=0; i<arr.length;i++){
          int value=list.getOrDefault(arr[i],0);
          list.put(arr[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it:list.entrySet()){
            if(it.getValue()>(arr.length/2)){
                return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
          int [] nums={3,3,4};
       int reulst=find(nums);
       System.out.print("Result : "+reulst);

    }
}
