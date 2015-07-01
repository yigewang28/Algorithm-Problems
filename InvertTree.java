/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        invert(root);
        return root;
    }
    private void invert(TreeNode index) {
        if(index == null) return;
        if(index.left!= null || index.right != null) {
            TreeNode temp = index.left;
            index.left = index.right;
            index.right = temp;
        }
        invert(index.left);
        invert(index.right);
    }
}