
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode() {} TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) { this.val = val; this.left
 * = left; this.right = right; } }
 */
public class Leetcode109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        int[] array = new int[count];
        int i = 0;
        temp = head;
        while (temp != null) {
            array[i] = temp.val;
            temp = temp.next;
            i++;
        }

        return constructTree(array, 0, array.length - 1);
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