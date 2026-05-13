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
    public boolean hasCycle(ListNode head) {
        // 1 -> 2
        // 0 -> 1
        ListNode fast = head;
        ListNode slow = head;

        // the reason that we need to check the fast.next is null or not
        // is because fast pointer is moving 2 step at a time,
        // so we don't want something like: null.next happens.
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }

        return false;
    }
}
