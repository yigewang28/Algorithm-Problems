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
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }
    private boolean valid(TreeNode root, long min, long max) {
        if(root == null) return true;
        if(root.val >= max || root.val <= min) return false;
        return valid(root.left, min, (long)root.val) && valid(root.right, (long)root.val, max);
    }
    
}