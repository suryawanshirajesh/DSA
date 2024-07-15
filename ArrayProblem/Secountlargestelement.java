//import java.util.List;
import java.util.*;
public class Secountlargestelement {

    public static int secoundelement(int [] arr){
     int Largestelement=0;
     int Secoundelement=0;
     for(int i=0;i<arr.length;i++){
        if(Largestelement<arr[i]){
            Secoundelement=Largestelement;
            Largestelement=arr[i];
        }else if(Largestelement>Secoundelement&&Secoundelement<arr[i]){
            Secoundelement=arr[i];
        }
     }
     System.out.println("Largest Element "+Largestelement);
     System.out.println("Secound Element "+Secoundelement);
    return 0;
    }

    public static int print2largest(List<Integer> arr) {
        int Largestelement=0;
        int Secoundelement=0;
        for (Integer integer : arr) {
            if(Largestelement<integer){
                Secoundelement=Largestelement;
                Largestelement=integer;
            }else if(Largestelement< Secoundelement &&Secoundelement<integer){
                Secoundelement=integer;
            }
        }
      return Secoundelement;
    }
    public static void main(String[] args) {
         int [] nums = {5,2,7,23,89,4};
         secoundelement(nums);
         List<Integer> list = new ArrayList<>();
         list.add(2);
         list.add(5);
         list.add(7);
         list.add(23);
         list.add(89);
         list.add(4);
        int result= print2largest(list);
        System.out.println("Result : "+result);
    }
}
