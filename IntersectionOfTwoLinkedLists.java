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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        if(temp == null || headB == null) return null;
        while(temp.next != null)
            temp = temp.next;
        temp.next = headB;
        ListNode result = find(headA);
        temp.next = null;
        return result;
        
    }
    // find intersection in cycle
    private ListNode find(ListNode head) {
        ListNode result = null;
        if(head == null)
            return null;
        ListNode front = head;
        ListNode back = head;
        while(front.next != null && front.next.next != null && back.next != null) {
            front = front.next.next;
            back = back.next;
            if(front == back) {
                front = head;
                while(front != back) {
                    front = front.next;
                    back = back.next;
                }
                result = front;
                break;
            }
        }
        return result;
    }
}