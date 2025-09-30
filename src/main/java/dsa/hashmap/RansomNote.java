package dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Ransom Note (LeetCode 383)   Topic: Hashmap   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150 <p>
 *
 * Problem:
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * Each letter in magazine can only be used once in ransomNote.
 */
public class RansomNote {
    /**
     * Approach:
     * Add each character from magazine into a hashmap with a count of each letter.
     * Iterate over each letter in ramsonNote and check the count store, if letter exist then reduce the count
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n+m)  Space: O(n)
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> letterMap = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            int count = (letterMap.getOrDefault(magazine.charAt(i), 0));
            letterMap.put(magazine.charAt(i), count + 1);
        }

        for (int j = 0; j < ransomNote.length(); j++) {
            int count = letterMap.getOrDefault(ransomNote.charAt(j), 0);
            if (count == 0) {
                return false;
            } else {
                count = letterMap.put(ransomNote.charAt(j), count - 1);
            }
        }
        return true;
    }

    /**
     * Approach:
     * Array Instead of Map: For lowercase letters a-z, use an int instead of a HashMap<Character, Integer>. This is faster and avoids unnecessary object overhead. <p>
     * Readability: The code is easier to read, as operations on a fixed-size array are straightforward compared to manipulating a map. <p>
     * Performance: Array access is O(1); Map access is generally O(1), but slower due to hashing and boxing overhead. <p>
     *
     * Complexity:
     * Sort: none
     * Time: O(n+m)  Space: O(n)
     *
     */
    public boolean optimizedCanConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26]; // Only lowercase letters assumed

        for (char c : magazine.toCharArray()) {
            letters[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (letters[c - 'a']-- == 0) {
                return false;
            }
        }
        return true;
    }
}
