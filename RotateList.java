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
public class RotateList {
	public ListNode rotateList(ListNode head) {
		if(head == null) return null;
		if(head.next == null) return head;

		ListNode index = head;
		ListNode temp = index.next;
		ListNode right;
		while(temp != null) {
			right = temp.next;
			temp.next = index;
			index = temp;
			temp = right;
		}
		head.next = null;
		return index;
	}

	public static void main(String[] args) {
		RotateList test = new RotateList();
		ListNode head = new ListNode(9);
		head.next = new ListNode(8);
		head.next.next = new ListNode(7);
		System.out.println(test.rotateList(head).val);
	}
}