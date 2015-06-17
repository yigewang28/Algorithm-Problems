/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {
    
    LinkedList<TreeNode> result;

    public BSTIterator(TreeNode root) {
        result = new LinkedList<TreeNode>();
        helper(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(result.size() <= 0) return false;
        else return true;
    }

    /** @return the next smallest number */
    public int next() {
        int value = result.pollFirst().val;
        return value;
    }
    
    private void helper(TreeNode root) {
        if(root == null) return;
        if(root.left != null) {
            helper(root.left);
            result.add(root);
        }
        else {
            result.add(root);
        }
        if(root.right != null) helper(root.right);
        
    }
    
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */