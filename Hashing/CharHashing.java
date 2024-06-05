
public class CharHashing {

    public static void main(String[] args) {
        String st = "aman";

        //pre computing
        int[] hash = new int[26];
        for (int i = 0; i < st.length(); i++) {
            hash[st.charAt(i) - 'a']++;
        }

        System.out.println(hash['m' - 'a']);
    }
}
