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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        traverse(root, result);
        return result;
    }
    
    public void traverse(TreeNode root, ArrayList<Integer> result)
    {
        if(root == null) return;
        
        if(root.left != null)
            traverse(root.left, result);
        if(root.right != null)
            traverse(root.right, result);
        
        result.add(root.val);
    }
}