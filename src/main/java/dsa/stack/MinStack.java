package dsa.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Title: Min Stack (LeetCode 155)   Topic: Stack   Difficulty: Medium
 * Link: https://leetcode.com/problems/min-stack/description/
 *
 * <p>
 * Problem:
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 */
public class MinStack {
    private List<Integer> list;
    private PriorityQueue<Integer> queue;

    public MinStack() {
        list = new ArrayList<>();
        queue = new PriorityQueue<>();
    }

    public void push(int val) {
        list.add(val);
        queue.add(val);
    }

    public void pop() {
        if (!list.isEmpty()) {
            queue.remove(list.get(size() - 1));
            list.remove(size() - 1);
        }
    }

    public int top() {
        return list.isEmpty() ? -1 : list.get(size() - 1);
    }

    public int getMin() {
        return queue.peek();
    }

    private int size() {
        return list.size();
    }
}
