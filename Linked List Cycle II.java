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
    public ListNode detectCycle(ListNode head) 
    {
        if(head == null) return null;
        ListNode Node1 = head;
        ListNode Node2 = head;
        boolean circle = false;
        
        while(Node1.next != null && Node2.next != null && Node2.next.next != null)
        {
            Node1 = Node1.next;
            Node2 = Node2.next.next;

            if(Node1 == Node2)
            {circle = true; break;}
        }
        
        Node1 = head;
        
        while(Node1.next != null && Node2.next != null)
        {
            if(Node1 == Node2)
            break;
            Node1 = Node1.next;
            Node2 = Node2.next;

        }
        
        if(!circle) return null;
        else return Node1;
    }
}