import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Findtripletsthatadduptoazero {

    public static List<List<Integer>> findtriplets(int [] arr) {
          List<List<Integer>> ans = new ArrayList<>();
          Arrays.sort(arr);

          for(int i=0;i<arr.length;i++){
            if(i!=0&&arr[i]==arr[i-1])continue;
            int j=i+1;
            int k=arr.length-1;
            while(j<k){
                int sum= arr[i]+arr[j]+arr[k];
                if(sum>0){
                  k--;
                }else if(sum<0){
                    j++;
                }else{
                    List<Integer> temp= Arrays.asList(arr[i],arr[j],arr[k]);
                    ans.add(temp);
                    j++;
                    k--;

                    while(j<k&&arr[j]==arr[j-1])j++;
                    while(j<k&&arr[k]==arr[k+1])k--;
                }
            }
          }
          return ans;
    }
    public static void main(String[] args) {
      int[]  nums = {-1,0,1,2,-1,-4};
      List<List<Integer>> ans=  findtriplets(nums);
      for (List<Integer> list : ans) {
        for (int number: list) {
            System.out.print(number+" ");
        }
        System.out.println();
      }
    }
}
