import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Leetcode890 {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans = new LinkedList<String>();
        StringBuilder p = helper(pattern);
        for (String s : words) {
            StringBuilder t = helper(s);
            boolean matched = true;
            for (int i = 0; i < t.length(); i++) {
                if (p.charAt(i) != t.charAt(i)) {
                    matched = false;
                    break;
                }
            }
            if (matched) {
                ans.add(s);
            }
        }
        return ans;
    }

    public StringBuilder helper(String s) {
        Map<Character, Integer> m = new HashMap<>();
        StringBuilder b = new StringBuilder();
        int index = 0;
        for (char c : s.toCharArray()) {
            if (m.containsKey(c)) {
                b.append(m.get(c));
            } else {
                b.append(index);
                m.put(c, index);
                index++;
            }
        }
        return b;
    }
}