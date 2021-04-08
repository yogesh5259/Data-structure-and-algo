import java.util.LinkedList;
import java.util.List;

public class LeetCode17 {
    public static List<String> letterCombinations(String digits) {
        LinkedList<String> output = new LinkedList<>();
        if(digits.length() == 0) return output;
        output.add("");
        String[] charMap = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        for(int i = 0; i < digits.length(); i++){
            int index = Character.getNumericValue(digits.charAt(i));
            while(output.peek().length() == i){
                String permutation = output.remove();
                for(char c : charMap[index].toCharArray()){
                    output.add(permutation + c);
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list = letterCombinations("23");
        System.out.println(list);
    }
}