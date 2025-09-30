package dsa.stack;

import java.util.Stack;

/**
 * Title:Valid Parentheses (LeetCode 20)   Topic: Stack   Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-parentheses/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. <p>
 * An input string is valid if:<p>
 *
 * - Open brackets must be closed by the same type of brackets. <p>
 * - Open brackets must be closed in the correct order. <p>
 * - Every close bracket has a corresponding open bracket of the same type. <p>
 */
public class ValidParentheses {
    /**
     * Approach:
     * Add characters in Stack if they are open brackets, otherwise pop and compare that it matches the closing bracket.
     * The Stack should be empty at the end
     *
     * <p>
     * Complexity:
     * Sort: None
     * Time: O(n)  Space: O(n)
     */
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false;
            } else {
                char c1 = stack.pop();
                if (c == ')' && c1 != '(') {
                    return false;
                }
                if (c == ']' && c1 != '[') {
                    return false;
                }
                if (c == '}' && c1 != '{') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
