package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leetcode79 {
    public String minWindow(String s, String t) {
        String ans = "";
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        int i = -1,j = -1;
        int frequency = t.length();
        int tempFrequency = 0;
        Map<Character,Integer> map1 = new HashMap<>();
        while (true){
            boolean f1 = true , f2 = true;
            //find ans
            while(i < s.length() - 1  && tempFrequency < frequency){
                i++;
                char c = s.charAt(i);
                map1.put(c, map1.getOrDefault(c,0) + 1);
                if(map.getOrDefault(c,0) >= map1.getOrDefault(c,0)){
                    tempFrequency++;
                }
                f1 = false;
            }
            //make short
            while(j < i && frequency == tempFrequency){
                String pan = s.substring(j + 1, i + 1);
                if(pan.length() < ans.length() || ans.length() == 0){
                    ans = pan;
                }
                j++;
                char c = s.charAt(j);
                if (map1.get(c) == 1){
                    map1.remove(c);
                } else{
                    map1.put(c , map1.get(c) - 1);
                }
                if(map1.getOrDefault(c,0) < map.getOrDefault(c,0)){
                    tempFrequency--;
                }
                f2 = false;
            }

            if (f1 && f2) {
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Leetcode79 l79 = new Leetcode79();
        System.out.println(l79.minWindow("ADOBECODEBANC", "ABC"));
    }
}
