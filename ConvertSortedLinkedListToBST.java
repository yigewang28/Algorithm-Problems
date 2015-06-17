/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        while(head != null)
        {
            num.add(head.val);
            head = head.next;
        }
        return arrayToBST(num, 0, num.size() - 1);
    }
    
    private TreeNode arrayToBST(ArrayList<Integer> num, int start, int end)
    {
        if(end < start)
            return null;
        if(end == start)
            return new TreeNode(num.get(start));
        else
        {
            int mid = (start + end) / 2;
            TreeNode tempNode = new TreeNode(num.get(mid));
            tempNode.left = arrayToBST(num, start, mid - 1);
            tempNode.right = arrayToBST(num, mid + 1, end);
            return tempNode;
        }
    } 
    /*
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        TreeNode root = null;
        ListNode end = head;
        while(end.next != null) {
            end = end.next;
        }
        return sort(head, end, root);
        
    }
    private TreeNode sort(ListNode start, ListNode end, TreeNode root) {
        if(start == null || end == null) return root;
        int length = 1;
        while(end.next != null) {
            end = end.next;
            length ++;
        }
        ListNode preMid = null;
        ListNode mid = start;
        for(int i = 0; i < length / 2; i++) {
            preMid = mid;
            mid = mid.next;
        }
        root = new TreeNode(mid.val);
        TreeNode temp = root;
        if(mid == end)
            temp.left = sort(start, preMid, root);
        if(mid == start)
            temp.right = sort(mid.next, end, root);
        return temp;
    }
    */
}