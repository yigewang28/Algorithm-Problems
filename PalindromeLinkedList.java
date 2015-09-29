/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode index = head;
        int count = 0;
        while(index != null) {
            stack.add(index);
            index = index.next;
            count++;
        }
        index = head;
        for(int i = 1; i <= count/2; i++) {
            if(index.val != stack.pop().val) {
                return false;
            }
            index = index.next;
        }
        return true;
    }
}