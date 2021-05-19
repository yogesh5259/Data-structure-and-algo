/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class Leetcode144 {
    List<Integer> ans = new LinkedList<Integer>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            ans.add(root.val);
            preorderTraversal(root.left);
        }
        if(root != null){
            preorderTraversal(root.right);
        } 
        return ans;
    }
}