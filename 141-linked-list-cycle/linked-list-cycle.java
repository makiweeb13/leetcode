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
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            head = head.next;
            fastPtr = fastPtr.next.next;
            if (head == fastPtr) return true;
        }
        return false;
    }
}