//1431. Kids With the Greatest Number of Candies

/*There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of 
candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
 they will have the greatest number of candies among all the kids, or false otherwise.
Note that multiple kids can have the greatest number of candies*/

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberofCandies {

     public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> ls = new ArrayList<>();
      int max = candies[0];
      for(int i=0;i< candies.length;i++){
          if(max<candies[i]){
            max=candies[i];
          }
          if(candies[i]+extraCandies>=max){
            ls.add(true);
          }
          if(candies[i]+extraCandies<max){
            ls.add(false);
          }
      }
      return ls;
    }
        public static void main(String[] args) {
            int [] candies = {2,5,3,1,4};
            int extraCandies=3;
         List<Boolean> name=  kidsWithCandies(candies, extraCandies);
           System.out.println(name);

        }
}
