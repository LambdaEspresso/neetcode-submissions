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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = null;
        ListNode cur = null;
        ListNode m1 = list1;
        ListNode m2 = list2;
        if (m1 != null && m2 != null) {
            if (m1.val <= m2.val) {
                res = new ListNode(m1.val, null);
                cur = res;
                m1 = m1.next;
            } else {
                res = new ListNode(m2.val, null);
                cur = res;
                m2 = m2.next;
            }
        } else {
            if (m1 != null) {
                res = new ListNode(m1.val, null);
                cur = res;
                m1 = m1.next;
            }
            if (m2 != null) {
                res = new ListNode(m2.val, null);
                cur = res;
                m2 = m2.next;
            }
        }
        while (m1 != null && m2 != null) {
            if (m1.val <= m2.val) {
                cur.next = new ListNode(m1.val, null);
                cur = cur.next;
                m1 = m1.next;
            } else {
                cur.next = new ListNode(m2.val, null);
                cur = cur.next;
                m2 = m2.next;
            }
        }
        while (m1 != null) {
            cur.next = new ListNode(m1.val, null);
            cur = cur.next;
            m1 = m1.next;
        }
        while (m2 != null) {
            cur.next = new ListNode(m2.val, null);
            cur = cur.next;
            m2 = m2.next;
        }
        return res;
    }
}