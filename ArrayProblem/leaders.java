import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leaders {

    static ArrayList<Integer> findleader(int arr[]) {
        int n= arr.length;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
            }
            max=Math.max(max, arr[i]);
        }
        Collections.reverse(list);
      return list;
    }
    public static void main(String[] args) {
       int arr[] = {16,17,4,3,5,2};
       List result = findleader(arr);
       for (Object object : result) {
          System.out.print(object+",");
       }
    }
}
