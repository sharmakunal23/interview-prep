package dsa.stack;

/**
 * Title: Min Stack (LeetCode 155)   Topic: Stack   Difficulty: Medium
 * Link: https://leetcode.com/problems/min-stack/description/
 *
 * <p>
 * Problem:
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */
public class MinStackOptimized {
    private Node head;

    public void push(int x) {
        if (head == null)
            head = new Node(x, x, null);
        else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}
