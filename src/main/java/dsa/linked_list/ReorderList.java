package dsa.linked_list;

/**
 * Title: Reorder List (LeetCode 143)   Topic: Linked List   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/reorder-list/description/
 *
 * <p>
 * Problem:
 * You are given the head of a singly linked-list. The list can be represented as:
 * <p>
 * L0 → L1 → … → Ln - 1 → Ln <p>
 * Reorder the list to be on the following form:
 * <p>
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → … <p>
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 */
public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        // 1. Find the middle of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // 2. Reverse the second half
        ListNode curr = slow.next;
        slow.next = null;
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // 3. Merge two halves
        ListNode first = head;
        ListNode second = prev;
        while (second != null) {
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
}
