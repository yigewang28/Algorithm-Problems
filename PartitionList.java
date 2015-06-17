/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;
        ListNode first = null;
        ListNode second = null;
        ListNode index = head;
        ListNode firstIndex = first;
        ListNode secondIndex = second;
        while(index != null) {
            if(index.val < x) {
                if(first == null) {
                    first = index;
                    firstIndex = index;
                }
                else {
                    firstIndex.next = index;
                    firstIndex = index;
                }
            }
            else {
                if(second == null) {
                    second = index;
                    secondIndex = index;
                }
                else {
                    secondIndex.next = index;
                    secondIndex = index;
                }
            }
            index = index.next;
        }
        if(second == null) return first;
        if(secondIndex.next != null) secondIndex.next = null;
        if(first == null) return second;
        firstIndex.next = second;
        return first;
    }
}