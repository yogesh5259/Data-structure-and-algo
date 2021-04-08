import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode1704{
    public static boolean halvesAreAlike(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int n = s.length();
        int  j = n / 2 ;
        int first = 0;
        int second = 0;
        for(int i = 0; i < j; i++){
            if(set.contains(s.charAt(i))){
                first++;
            }
            if(set.contains(s.charAt(i+j))){
                second++;
            }
          
        }
               
               
        return first == second;
    }
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
}