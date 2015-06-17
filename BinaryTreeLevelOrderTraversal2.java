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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 1;
        while(queue.size() > 0) {
            int newcount = 0;
            List<Integer> row = new ArrayList<Integer>();
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
            result.addFirst(row);
            count = newcount;
        }
        return result;
    }
}