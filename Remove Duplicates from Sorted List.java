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
        
        ListNode pointer = head.next;
        ListNode pre = head;

        while(pointer != null) 
        {
            if(pointer.val == pre.val)
            {
                pre.next = pointer.next;
                pointer = pointer.next;
            }
            else
            {
                pre = pointer;
                pointer = pointer.next;
            }
        }
        return head;
    }
    
    /*public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        
        HashSet<Integer> set = new HashSet<Integer>();
        
        ListNode pointer = head.next;
        ListNode pre = head;
        set.add(head.val);
        int i = 2;
        while(pointer != null) 
        {
            if(!set.contains(pointer.val))
            {
                set.add(pointer.val);
                i++;
                pre = pointer;
            }
            else if(pointer.next != null) pre.next = pointer.next;
            else if(pointer.next == null) pre.next = null;
            
            pointer = pointer.next;
        }
        return head;
    }
    */
}