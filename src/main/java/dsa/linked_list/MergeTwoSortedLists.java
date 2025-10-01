package dsa.linked_list;

/**
 * Title: Merge Two Sorted Lists (LeetCode 21)   Topic: Linked List   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/merge-two-sorted-lists/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * You are given the heads of two sorted linked lists list1 and list2.
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists. <p>
 * Return the head of the merged linked list.
 */
public class MergeTwoSortedLists {
    /**
     * Approach:
     * Create a dummy node and add the first node to its next from list1 and list2.
     * if list1 is null, set next to list2, otherwise list1
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n)  Space: O(1)
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else  {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if (list1 != null) {
            cur.next = list1;
        } else  {
            cur.next = list2;
        }
        return dummyHead.next;
    }
}
