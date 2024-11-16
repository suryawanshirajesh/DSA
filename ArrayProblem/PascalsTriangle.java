import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<Integer> Genraterow(int row){
        long ans=1;
        List<Integer> ansrow = new ArrayList<>();
        ansrow.add(1);
         for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=(ans)/col;
            ansrow.add((int)ans);
         }
        return ansrow;
    }
    public static List<List<Integer>> triangle(int N){
        List<List<Integer>> list= new ArrayList<>();
        for(int i=1;i<=N;i++){
            list.add(Genraterow(i));
        }
        return list;
    }
    public static void main(String[] args) {
        int N=6;
        List<List<Integer>> ans = triangle(N);
        for (List<Integer> list : ans) {
            for (Integer list2 : list) {
                System.out.print(list2+" ");
            }
            System.out.println();
        }
    }
}
