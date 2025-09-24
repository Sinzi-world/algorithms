package solutions;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()){return false;}

        for (char ch: s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(char ch: t.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) < 0){
                return false;
            }
            map.put(ch, map.get(ch) - 1);

        }

        for (int i: map.values()){
            if (i != 0){
                return false;
            }
        }
        return true;


    }

    public static void main(String[] args) {
        String s = "aacc";
        String t = "ccac";

        System.out.println(isAnagram(s, t));
    }

}
