
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
public class Leetcode108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return constructTree(nums, 0, nums.length - 1);
    }

    private TreeNode constructTree(int[] array, int left, int right) {

        if (left > right)
            return null;
        int mid = left + (right - left) / 2;
        TreeNode node = new TreeNode(array[mid]);
        node.left = constructTree(array, left, mid - 1);
        node.right = constructTree(array, mid + 1, right);
        return node;
    }
}