package dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * Title: Top K Frequent Elements (LeetCode 347)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/top-k-frequent-elements/
 *
 * <p>
 * Problem:
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 */
public class TopKFrequentElements {
    /**
     1. if k is larger than the nums.length, then return nums
     2. Create a HashMap and count the number of occurance of each element
     2. Create a max priority queue and pop the first k elements and to the new int[]
     */
    public int[] topKFrequent(int[] nums, int k) {
        int size = nums.length;

        if (k >= size || size == 0) return nums;

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < size; i++) {
            int count = countMap.getOrDefault(nums[i], 0);
            countMap.put(nums[i], count + 1);
        }

        PriorityQueue<List<Integer>> maxPQ = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.get(1), b.get(1)) * -1
        );

        for (int key: countMap.keySet()) {
            List<Integer> list = new ArrayList<>(2);
            list.add(key);
            list.add(countMap.get(key));
            maxPQ.add(list);
        }

        int[] mostFrequent = new int[k];

        for (int j = 0; j < k; j++) {
            mostFrequent[j] = maxPQ.poll().get(0);
        }

        return mostFrequent;

    }
}
