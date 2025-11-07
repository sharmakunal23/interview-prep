package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Title:  Group Anagrams (LeetCode 49)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/group-anagrams/
 *
 * <p>
 * Problem:
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 */
public class GroupAnagrams {
    /**
     1. Create a list and call it anagrams
     2. Create another list and call it group
     3. Create a HashMap and call it anagramMap
     4. Create a function that sorts the letters and returns the string
     5. if map.containsKey(sortedString), then add it in the value list
     6. iterate through the map and add each list in the group list and return.
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> group = new ArrayList<>();

        if (strs.length == 0) {
            group.add(new ArrayList<>());
            return group;
        }

        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            String sorted = sortString(str);
            if (anagramMap.containsKey(sorted)) {
                List<String> list = anagramMap.get(sorted);
                list.add(str);
                anagramMap.put(sorted, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(str);
                anagramMap.put(sorted, list);
            }
        }

        for (List<String> value : anagramMap.values()) {
            group.add(value);
        }

        return group;
    }

    private String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
