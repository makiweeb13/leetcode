/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {

        ListNode ptr1 = head, ptr2 = head;

        while (ptr2.next != null && ptr2.next.next != null && ptr2.next.next.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }

        if (head.next != null) ptr1.next = ptr1.next.next;
        else head = ptr1.next;
    
        return head;
    }
}