
public class Leetcode844{
	public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = buildString(s);
        Stack<Character> s2 = buildString(t);
        
    return compareStack(s1,s2);
    }
    
    private Stack<Character> buildString(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '#'){
                if(stack.size() > 0){
                    stack.pop();
                }
            } else {
                stack.push(c);
            }
        }
        return stack;
    }
    
    private boolean compareStack(Stack<Character> s1, Stack<Character> s2){
        if(s1.size() != s2.size()) return false;
        int n = s1.size();
        for(int i = 0; i < n ; i++){
            if(s1.pop() != s2.pop()){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}