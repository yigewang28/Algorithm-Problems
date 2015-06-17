/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return null;
        ListNode index = head;
        while(index != null) {
            if(index.val == val) 
                index = index.next;
            else break;
        }
        if(index == null) return null;
        ListNode result = index;
        
        index = result.next;
        ListNode prev = result;
        while(index != null) {
            if(index.val == val) {
                prev.next = index.next;
                index = index.next;
            }
            else {
                prev = index;
                index = index.next;
            }
        }
        return result;
    }
}