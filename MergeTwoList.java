/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 != null && l2 == null) return l1;
        if(l1 == null && l2 != null) return l2;
        
        ListNode result = new ListNode(0);
        ListNode i = result;
        
        while(l1 != null || l2 != null) {
            if(l2 == null || (l1 != null && l1.val < l2.val)) {
                i.next = l1;
                i = i.next;
                l1 = l1.next;
            }
            else {
                i.next = l2;
                i = i.next;
                l2 = l2.next;
            }
        }
        return result.next;
    }
}