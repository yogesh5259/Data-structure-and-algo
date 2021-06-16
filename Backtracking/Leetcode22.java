import java.util.ArrayList;
import java.util.List;


class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> output_arr = new ArrayList();
        backtracking(output_arr, "", 0, 0, n);
        return output_arr;
    }

    public void backtracking(List<String> output_arr, String current_string, int open, int close, int max) {
        if (current_string.length() == max * 2) {
            output_arr.add(current_string);
            return;
        }
        if (open < max)
            backtracking(output_arr, current_string + "(", open + 1, close, max);
        if (close < open)
            backtracking(output_arr, current_string + ")", open, close + 1, max);
    }
}