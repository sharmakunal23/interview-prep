package dsa.sliding_window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: Permutation in String (LeetCode 567)   Topic: Sliding Window   Difficulty: Medium
 * Link: https://leetcode.com/problems/permutation-in-string/description/
 *
 * <p>
 * Problem:
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
public class PermutationInString {
    /**
     1. If s1.length > s2.length, return false
     2. Sort s1
     3. Create a window of size s1.length, and iterate through s2, sort each substring and confirm equlity.
     */
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;
        // return bruteForce(s1, s2);
        return optimized(s1, s2);


    }

    private boolean optimized(String s1, String s2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        int windowSize = s1.length();

        map1 = countLetter(map1, s1);
        map2 = countLetter(map2, s2.substring(0, windowSize));

        if (map1.equals(map2)) return true;

        int left = 0;
        int right = s1.length();

        while (right < s2.length()) {
            char current = s2.charAt(right++);
            char previous = s2.charAt(left++);

            if (current == previous) continue;

            int previousValue = map2.getOrDefault(previous, 0);
            int currentValue = map2.getOrDefault(current, 0);

            if (previousValue == 1) {
                map2.remove(previous);
            } else {
                map2.put(previous, previousValue - 1);
            }

            map2.put(current, currentValue + 1);
            if (map1.equals(map2)) return true;
        }

        return false;
    }

    private Map<Character, Integer> countLetter(Map<Character, Integer> map, String s) {
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        return map;
    }


    private boolean bruteForce(String s1, String s2) {
        int left = 0;
        int right = s1.length();

        String sorted = sortString(s1);

        while (right <= s2.length()) {
            String sortedSubString = sortString(s2.substring(left, right));
            if (sorted.equals(sortedSubString)) return true;
            left++;
            right++;
        }

        return false;
    }

    private String sortString(String s1) {
        char[] charArray = s1.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
