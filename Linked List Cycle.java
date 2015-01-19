/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null) return false;
        ListNode Node1 = head;
        ListNode Node2 = head;
        
        boolean result = false;
        while(Node1.next != null && Node2.next != null && Node2.next.next != null)
        {
            Node1 = Node1.next;
            Node2 = Node2.next.next;
            if(Node1 == Node2) 
            {
                result = true;
                break;
            }
        }
        if(result)
            return true;
        else 
            return false;
        
    }
}