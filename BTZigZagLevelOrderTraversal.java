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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null) return result;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 1;
        boolean zig = false;
        
        while(queue.size() > 0) {
            LinkedList<Integer> row = new LinkedList<Integer>();
            int newcount = 0;
            
            for(int i = 1; i <= count; i++) {
                TreeNode temp = queue.pollFirst();
                
                if(!zig) row.addLast(temp.val);
                else row.addFirst(temp.val);
                
                if(temp.left != null) {
                    queue.addLast(temp.left);
                    newcount ++;
                }
                if(temp.right != null) {
                    queue.addLast(temp.right);
                    newcount ++;
                }
            }
            count = newcount;
            result.add(row);
            if(!zig) zig = true;
            else zig = false;
        }
        
        return result;
    }
}