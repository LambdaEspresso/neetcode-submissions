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
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode res = null;
        ListNode oldHead;
        ListNode temp = head;
        do {
            oldHead = res;
            res = new ListNode(temp.val, oldHead);
        } while ((temp = temp.next) != null);
        return res;
    }
}
