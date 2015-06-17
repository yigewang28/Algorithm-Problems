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
    
    public int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        return sum(root, 0);
    }
    
    private int sum(TreeNode root, int tempSum) {
        if(root == null) return 0;
        tempSum = tempSum * 10 + root.val;
        if(root.left == null && root.right == null) return tempSum;
        
        return sum(root.left, tempSum) + sum(root.right, tempSum);
    }
}