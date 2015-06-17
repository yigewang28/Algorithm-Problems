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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        ListNode current = head;
        ListNode back = head;
        int count = 1;
        while(current.next != null) {
            current = current.next;
            count ++;
        }
        k = k % count;
        if(k == 0) return head;
        for(int i = 0; i < count - k - 1; i ++) {
            back = back.next;
        }
        ListNode result = back.next;
        current.next = head;
        back.next = null;
        return result;

    }
}