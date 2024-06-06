package LeetCode;

import java.util.*;

public class RomanToInt {

    public static int romanToInt(String s) {
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentvalue = romanValues.get(currentChar);

            if (currentvalue < prevValue) {
                total -= currentvalue;
            } else {
                total += currentvalue;
            }
            currentvalue = prevValue;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IIX"));
    }
}
