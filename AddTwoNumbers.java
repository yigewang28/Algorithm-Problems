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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        ListNode result = null;
        ListNode index = null;
        boolean isUp = false;
        while(l1 != null || l2 != null) {
            int tempVal = 0;
            if(l1 != null) {
                tempVal += l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                tempVal += l2.val;
                l2 = l2.next;
            }
            if(isUp) tempVal ++;
            isUp = (tempVal >= 10);
            tempVal = tempVal % 10;
            ListNode temp = new ListNode(tempVal);
            if(result == null) {
                result = temp; 
                index = result;
            }
            else {
                index.next = temp;
                index = temp;
            }
        }
        if(isUp)
            index.next = new ListNode(1);
        return result;
    }
    
}