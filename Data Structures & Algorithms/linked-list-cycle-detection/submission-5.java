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
        ListNode node = head;
        HashSet<Integer> set = new HashSet<>();
        while (node != null && node.next != null) {
            if (set.contains(node.next.val)) return true;
            else set.add(node.next.val);
            node = node.next;
        }
        return false;
    }
}
