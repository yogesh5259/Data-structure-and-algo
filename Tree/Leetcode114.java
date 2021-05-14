public class Leetcode114 {
    TreeNode head = null;

    public void flatten(TreeNode root) {
        if (root != null)
            travel(root);
    }

    private void travel(TreeNode root) {
        if (root.right != null)
            travel(root.right);
        if (root.left != null)
            travel(root.left);
        root.left = null;
        root.right = head;
        head = root;
    }
}
