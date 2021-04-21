import java.util.LinkedList;
import java.util.List;

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

class Leetcode589 {
    private List<Integer> ans = new LinkedList<>();
    public List<Integer> preorder(Node root) {
        if(root == null) return ans;
        helper(root);
        return ans;
    }
    
    private void helper(Node root){
        if(root != null) {
            ans.add(root.val);
        }
        List<Node> l = root.children;
        for(int i = 0; i < l.size(); i++){
            helper(l.get(i));
        }
    }
}