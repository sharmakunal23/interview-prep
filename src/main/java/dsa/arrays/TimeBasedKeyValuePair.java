package dsa.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title: Time Based Key-Value Store (LeetCode 981)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/time-based-key-value-store/description/
 *
 * <p>
 * Problem:
 * Design a time-based key-value data structure that can store multiple values for the same key at different time stamps and retrieve the key's value at a certain timestamp.
 * <p>
 * Implement the TimeMap class:
 * <p>
 * - TimeMap() Initializes the object of the data structure. <p>
 * - void set(String key, String value, int timestamp) Stores the key key with the value value at the given time timestamp. <p>
 * - String get(String key, int timestamp) Returns a value such that set was called previously, with timestamp_prev <= timestamp.
 * If there are multiple such values, it returns the value associated with the largest timestamp_prev. If there are no values, it returns "".
 */
public class TimeBasedKeyValuePair {
    Map<String, List<Data>> map;

    public TimeBasedKeyValuePair() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.computeIfAbsent(key, k -> new ArrayList<Data>()).add(
                new Data(value, timestamp)
        );
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";
        return binarySearch(map.get(key), timestamp);
    }

    private String binarySearch(List<Data> list, int timestamp) {
        int left = 0, right = list.size() - 1;

        while (left < right) {
            int mid = 1 + left + ((right - left) / 2);

            if (timestamp < list.get(mid).timestamp) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }

        return list.get(left).timestamp <= timestamp ? list.get(left).value : "";
    }

    private class Data {
        String value;
        int timestamp;
        public Data(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
    }
}
