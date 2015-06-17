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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode preIndex = head;
        ListNode index = head.next;
        
        ListNode end = head;
        int sortedLength = 1;
        
        while(index != null) {
            ListNode temp = head.next;
            ListNode preTemp = head;
            boolean inserted = false;
            if(head.val > index.val) {
                preIndex.next = index.next;
                index.next = head;
                head = index;
                index = preIndex.next;
                sortedLength ++;
                inserted = true;
            }
            if(inserted) continue;
            for(int i = 2; i <= sortedLength; i++) {
                if(index.val < temp.val) {
                    preIndex.next = index.next;
                    index.next = temp;
                    preTemp.next = index;
                    index = preIndex.next;
                    sortedLength ++;
                    inserted = true;
                    break;
                }
                else {
                    temp = temp.next;
                    preTemp = preTemp.next;
                }
            }
            if(!inserted) {
                sortedLength ++;
                preIndex = index;
                index = index.next;
            }
        }
        return head;
    }
}