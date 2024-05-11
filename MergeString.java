// You are given two strings word1 and word2. Merge the strings by adding letters in alternating 
//order, starting with word1. If a string is longer than the other, append the additional letters
// onto the end of the merged string. Return the merged string.

public class MergeString {
     /*simple way  */
     
    // public static String mergeAlternately(String word1, String word2) {
    //     String merString="";
    //     int l1=word1.length();
    //     int l2 =word2.length();
    //     int min = Math.min(l1, l2);
    //      for(int i=0;i<min;i++){
    //         merString+=word1.charAt(i)+""+word2.charAt(i);
    //      }
    //      if(l1>l2){
    //      merString=merString+word1.substring(min);
    //      }
    //      if(l2>l1){
    //       merString=merString+word2.substring(min);
    //      }
         
    //     return  merString;
    // };

    public static String mergeAlternately(String word1, String word2) {
        int l1 = word1.length();
        int l2 = word2.length();
        int min = Math.min(l1,l2);
        StringBuilder str = new StringBuilder();
        
        for(int i=0;i<min;i++){
            str.append(word1.charAt(i)).append(word2.charAt(i));
        }
        if(l1==l2){
            return str.toString();
        }
        if(l1>l2){
            return str.append(word1.substring(min)).toString();
        }else{
            return str.append(word2.substring(min)).toString();
        }
    }

    public static void main(String[] args) {
        String word1="abc";
        String word2="pqrst";
       
       String name= mergeAlternately(word1, word2);
       System.out.println(name);

    }
}
