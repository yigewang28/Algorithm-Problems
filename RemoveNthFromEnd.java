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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode index = head;
        int k = 1;
        while(index.next != null){
            index = index.next;
            k ++;
        }
        if(k == n) 
            return head.next;
        index = head;
        ListNode front = null;
        while(k != n) {
            front = index;
            index = index.next;
            k --;
        }
        front.next = index.next;
        return head;
    }
}