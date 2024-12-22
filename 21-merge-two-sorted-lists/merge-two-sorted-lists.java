/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = null, trav = merged, ptr1 = list1, ptr2 = list2;
        while (ptr1 != null || ptr2 != null) {
            ListNode temp;
            if (ptr1 == null) {
                temp = new ListNode(ptr2.val, null);
                ptr2 = ptr2.next;
            } else if (ptr2 == null || ptr1.val < ptr2.val) {
                temp = new ListNode(ptr1.val, null);
                ptr1 = ptr1.next;
            } else {
                temp = new ListNode(ptr2.val, null);
                ptr2 = ptr2.next;
            }
            if (merged == null) {
                merged = temp;
                trav = merged;
            } else {
                trav.next = temp;
                trav = trav.next;
            }
        }
        return merged;
    }
}