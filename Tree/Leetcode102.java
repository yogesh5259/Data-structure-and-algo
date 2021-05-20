import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

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

public class Leetcode102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> ans = new LinkedList<>();
        if(root == null) return result;
        ans.add(root);
        while(!ans.isEmpty()){
            int size = ans.size();
            List<Integer> currentLevel = new LinkedList<>();
            for(int i = 0; i < size; i++){
                TreeNode current = ans.remove();
                currentLevel.add(current.val);
                if(current.left != null){
                    ans.add(current.left);
                }
                if(current.right != null){
                    ans.add(current.right);
                }
            }
            result.add(currentLevel); 
        }
        return result;
    }
}