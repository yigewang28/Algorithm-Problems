/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode current = head;
        ListNode temp = null;
        ListNode front = current.next;
        while(current != null) {
            current.next = temp;
            temp = current;
            if(front == null) return current;
            else {
                current = front;
                front = front.next;
            }
        }
        return current;
    }
}