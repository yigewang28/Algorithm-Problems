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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return symmetric(root.left, root.right);
    }
	
    public boolean symmetric(TreeNode left, TreeNode right) {
    	if(left == null || right == null) 
    	    return left == null && right == null;
        return left.val == right.val && symmetric(left.left, right.right) && symmetric(left.right, right.left);
    }
    
}