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
    
    public void flatten(TreeNode root) {
        if(root == null) return;
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        while(list.size() > 0) {
            TreeNode temp = list.pollLast();
            if(temp.right != null) list.add(temp.right);
            if(temp.left != null) list.add(temp.left);
            if(list.size() > 0) {
                temp.right = list.getLast();
            }
            else {
                temp.right = null;
            }
            temp.left = null;
        }
    }
    /*
    TreeNode result = new TreeNode(0);
    
    public void flatten(TreeNode root) {
        if(root == null) return;
        TreeNode head = result;
        head.left = null;
        traverse(root);
        root = head.right;
    }
    
    private void traverse(TreeNode root) {
        //if(root == null) return;
        result.right = new TreeNode(root.val);
        result.left = null;
        result = result.right;
        if(root.left != null) traverse(root.left);
        if(root.right != null) traverse(root.right);
    }
    */
}