package dsa.heap;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Title:  Kth Largest Element in an Array (LeetCode 215)   Topic: Heap / Priority Queue   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 *
 * <p>
 * Problem:
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <p>
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <p>
 * Can you solve it without sorting?
 */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {

        int max = -1;

        int size = nums.length;

        Queue<Integer> heap = new PriorityQueue<>(
                (a,b) -> Integer.compare(a, b) * -1
        );

        for (int num : nums) {
            heap.offer(num);
        }

        while (k > 0) {
            max = heap.poll();
            k--;
        }

        return max;

    }
}
