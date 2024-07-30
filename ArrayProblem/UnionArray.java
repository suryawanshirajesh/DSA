import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnionArray {
    public static void union(int [] arr1,int [] arr2){
        Set<Integer> list = new HashSet<>();
        ArrayList<Integer> s = new ArrayList<>();
        for (Integer integer : arr1) {
            list.add(integer);
        }
        for (Integer integer : arr2) {
            list.add(integer);
        }
     for (Integer integer : list) {
          s.add(integer);
     }
    }
    
    public static void main(String[] args) {
        int [] arr1={1,1,2,3,5,5,6,6,};
        int [] arr2={1,4,6,8};
        union(arr1, arr2);
    }
}
