package dsa.linked_list;

/**
 * Title: Reverse Linked List (LeetCode 206)   Topic: Linked List   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/reverse-linked-list/description/
 *
 * <p>
 * Problem:
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 */
public class ReverseLinkedList {
    /**
     * Approach:
     * change pointers iteratively.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public ListNode reverseListIterative(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    /**
     * Approach:
     * change pointers recursively.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n)
     */
    public ListNode reverseListRecursive(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode newHead = head, next = head.next;
        if (next != null) {
            newHead = reverseListRecursive(next);
            next.next = head;
        }
        head.next = null;
        return newHead;
    }
}
