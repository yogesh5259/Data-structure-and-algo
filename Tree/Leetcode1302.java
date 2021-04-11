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
class Solution {
    int maxlevel = -1;
    int sum = 0;
    public int deepestLeavesSum(TreeNode root) {
        find(root,0);
        return sum; 
    }
    
    private void find(TreeNode root, int level){
        if(root != null){
            find(root.left, ++level);
            if(maxlevel < level){
                sum = 0;
                maxlevel = level;
            }
            if(maxlevel == level) {
                sum = sum + root.val;
            }
            find(root.right, level);
        }
    }
}