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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        if(root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 1;
        while(queue.size() > 0) {
            result.add(queue.getLast().val);
            int newcount = 0;
            for(int i = 1; i <= count; i++) {
                TreeNode temp = queue.pollFirst();
                if(temp.left != null) {
                    queue.add(temp.left);
                    newcount ++;
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                    newcount ++;
                }
            }
            count = newcount;
        }
        return result;
    }
}