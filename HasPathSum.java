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
    public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) 
			return false;
		else {
		    if(root.left != null) {
			    if(hasPathSum(root.left, sum - root.val)) return true;
		    }
		    if(root.right != null) {
			    if(hasPathSum(root.right, sum - root.val)) return true;
	    	}
		    if(root.left == null && root.right == null)
			    return root.val == sum;
		    return false;
		}
    }
}