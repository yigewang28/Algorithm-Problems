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
    /*
    // inorder traversal search
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        search(root, result);
        return result.get(k - 1);
    }
    
    private void search(TreeNode root, ArrayList<Integer> result) {
        if(root.left != null) search(root.left, result);
        result.add(root.val);
        if(root.right != null) search(root.right, result);
    }
    */
    int count = 0;
    int result = 0;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        search(root);
        return result;
    }
    
    private void search(TreeNode root) {
        if(root.left != null) {
            search(root.left);
            if(count == 0) {
                return;
            }
        }
        count--;
        if(count == 0) {
            result = root.val;
            return;
        }
        if(root.right != null) search(root.right);
    }
}