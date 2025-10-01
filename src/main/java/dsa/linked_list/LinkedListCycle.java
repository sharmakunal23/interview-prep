package dsa.linked_list;

import java.util.HashSet;

/**
 * Title: Linked List Cycle (LeetCode 141)   Topic: Linked List   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/linked-list-cycle/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 * Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter. <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {
    /**
     * Approach:
     * create a slow and a fast pointer. slow moves 1 step while the fast moves 2.
     * If there is a cycle they'll eventually be the same object.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    /**
     * Approach:
     * create a hashset, check if the node already exist in the set, if not,
     * add each node iteratively in the set.
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(n)
     */
    public boolean hasCycleHashSet(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        ListNode curr = head;
        while (curr != null) {
            if (hashSet.contains(curr)) {
                return true;
            }
            hashSet.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
