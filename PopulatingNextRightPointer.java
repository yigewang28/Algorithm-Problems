/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null) return;
        LinkedList<TreeLinkNode> list = new LinkedList<TreeLinkNode>();
        
        list.add(root);
        //int count = 1;
        int j = 0;
        while(!list.isEmpty()) {
            int count = (1 << j);
            TreeLinkNode[] temp = new TreeLinkNode[count];
            for(int i = 0; i < count; i++) {
                temp[i] = list.poll();
                if(temp[i].left != null) list.add(temp[i].left);
                if(temp[i].right != null) list.add(temp[i].right);
            }
            int k = 0;
            while(k < count-1) {
                temp[k].next = temp[k+1];
                k++;
            }
            temp[k].next = null;
            j ++;
        }
    }
}