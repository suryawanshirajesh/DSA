import java.util.Arrays;
import java.util.List;


public class ReverseWords {

     public static String reverseWords(String s) {
        String result="";
        List<String> word = Arrays.asList(s.trim().split("\\s+"));
        for(int i=word.size()-1;i>=0;i--){
              result+=word.get(i);
              if(i>0){
                result+=" ";
              }
        }
      return result; 
    }
    public static void main(String[] args) {
      String s = "hello world";
        String result=reverseWords(s);
        System.out.println(result);
    }
}
