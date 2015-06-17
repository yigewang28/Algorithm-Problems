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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode back = head;
        ListNode front = head.next;
        ListNode temp = null;
        ListNode result = null;
        ListNode pre = null;
        
        while(back != null && front != null) {

            temp = front.next;
            front.next = back;
            back.next = temp;
            pre = back;
            if(result == null) 
                result = front;
            if(temp == null) return result;
            back = temp;
            front = back.next;
            if(front != null) pre.next = front;
         
        }
        return result;
    }
}