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
        Map<ListNode, Integer> map = new HashMap<>();

        while (head != null) {
            map.put(head, map.getOrDefault(head, 0) + 1);
            if (map.get(head) > 1) {
                return true;
            }

            head = head.next;
        }

        return false;
    }
}
