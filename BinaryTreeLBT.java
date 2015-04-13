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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 1;
        int newcount = 0;
        //int depth = 0;
        while(!queue.isEmpty()) {
            LinkedList<Integer> row = new LinkedList<Integer>();
            for(int i = 1; i <= count; i++) {
                TreeNode temp = queue.poll();
                row.add(temp.val);
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
            newcount = 0;
            result.add(row);
        }
        return result;
    }
}