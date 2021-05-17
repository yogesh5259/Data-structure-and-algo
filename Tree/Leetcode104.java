/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
public class Leetcode104 {
    int depth = 1;

    public int maxDepth(TreeNode root) {
        int right = 1;
        int left = 1;
        if (root == null)
            return 0;
        right += maxDepth(root.right);
        left += maxDepth(root.left);
        return Math.max(right, left);
    }
}