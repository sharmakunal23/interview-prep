package dsa.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Word Pattern (LeetCode 290)   Topic: Hashmap   Difficulty: Easy <p>
 * Link: https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150 <p>
 *
 * Problem:
 * Given a pattern and a string s, find if s follows the same pattern. <p>
 *
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s. <p>
 *   Specifically: <p>
 * - Each letter in pattern maps to exactly one unique word in s. <p>
 * - Each unique word in s maps to exactly one letter in pattern. <p>
 * - No two letters map to the same word, and no two words map to the same letter.
 */
public class WordPattern {
    /**
     * Approach:
     * Create two hashmaps to check mapping from pattern to String and String to pattern
     *
     * <p>
     * Complexity:
     * Sort: none
     * Time: O(n+m)  Space: O(n)
     */
    public boolean wordPattern(String pattern, String s) {
        String[] split = s.split(" ");

        if (pattern.length() != split.length) {
            return false;
        }

        Map<Character, String> charMapping = new HashMap<>();
        Map<String, Character> wordMapping = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (charMapping.get(pattern.charAt(i)) != null) {
                if (!charMapping.get(pattern.charAt(i)).equals(split[i])) {
                    return false;
                }
            } else {
                charMapping.put(pattern.charAt(i), split[i]);
            }

            if (wordMapping.get(split[i]) != null) {
                if (wordMapping.get(split[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                wordMapping.put(split[i], pattern.charAt(i));
            }
        }
        return true;
    }
}
