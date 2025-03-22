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
    public int pairSum(ListNode head) {
        ListNode ptr = head;
        ArrayList<Integer> values = new ArrayList<>();
        int sum = 0;

        while (ptr != null) {
            values.add(ptr.val);
            ptr = ptr.next;
        }

        int n = (values.size()/2), size = values.size();

        for (int i = 0; i < n; i++) {
            sum = Math.max(sum, values.get(i) + values.get(size-1-i));
        } 

        return sum;
    }
}