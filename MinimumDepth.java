/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public int depth(TreeNode root) {
        if(root.left == null && root.right == null) return 1;
        else if(root.left == null && root.right != null) return depth(root.right) + 1;
        else if(root.left != null && root.right == null) return depth(root.left) + 1;
        else return Math.min(depth(root.left) + 1, depth(root.right) + 1);
    }
    
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        return depth(root);
    }
}