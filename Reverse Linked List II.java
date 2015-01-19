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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null || m == n) return head;
        
        int count = 1;
        ListNode pre = null;
        ListNode current = head;
        
        while(count < m)
        {
            pre = current;
            current = current.next;
            count++;
        }
         ListNode after = current;
         ListNode temp1 = current.next;
         ListNode temp2 = temp1.next;
        
        while(count < n)
        {
            temp1.next = current;
            current = temp1;
            temp1 = temp2;
            if(temp2 !=null) temp2 = temp2.next;
            count++;
        }
        
        if(pre == null) 
        {
            after.next = temp1;
            return current;
        }
        
        if(pre != null) pre.next = current;
        after.next = temp1;
        return head;
    }
}