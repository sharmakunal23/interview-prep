package dsa.sliding_window;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Longest Substring Without Repeating Characters (LeetCode 3)   Topic: Sliding Window   Difficulty: Medium
 * Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given a string s, find the length of the longest substring without duplicate characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * Approach:
     * Use a hashmap to track Characters and index, update indexes and left pointer where a duplicate character exist
     *
     *
     * <p>
     * Complexity:
     * Sort: Not required
     * Time: O(n)  Space: O(n)
     */
    public int lengthOfLongestSubstring(String s) {
        // Input: s = "abcbbcbb"
        // 0 -> add "a" to map, result = 1
        // 1 -> add "b" to map, result = 2
        // 2 -> add "c" to map, result = 3
        // 3 -> b exists in map with index 1
        // set left pointer to 2, update index for b in amp, result is Math.max(3, right - left + 1)
        // Ouput: 3
        // Explanation: The answer is "abc", with the length of 3.
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {
                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;
                charMap.put(s.charAt(right), right);
            }
        }

        return maxLength;
    }
}
