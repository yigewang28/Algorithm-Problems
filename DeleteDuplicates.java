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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode index = head;
        ListNode temp = index;
        while(index != null) {
            temp = index;
            index = temp.next;
            while(index != null && index.val == temp.val)
                index = index.next;
            temp.next = index;
        }
        return head;
    }
}