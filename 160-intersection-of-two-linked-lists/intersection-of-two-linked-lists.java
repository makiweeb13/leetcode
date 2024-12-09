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
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptrA = headA, ptrB = headB;
        while (ptrA != ptrB && (ptrA != null || ptrB != null)) {
            if (ptrA == null) {
                ptrA = headB;
            } 
            else if (ptrB == null) {
                ptrB = headA;
            } 
            else {
                ptrA = ptrA.next;
                ptrB = ptrB.next;
            }
        }
        return ptrA == ptrB ? ptrA : null;
    }
}