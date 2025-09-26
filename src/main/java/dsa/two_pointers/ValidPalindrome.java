package dsa.two_pointers;

/**
 * Title: Valid Palindrome (LeetCode 125)   Topic: Two Pointers   Difficulty: Easy
 * Link: https://leetcode.com/problems/valid-palindrome/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * <p>
 * Problem:
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 */
public class ValidPalindrome {

    /**
     * Approach:
     * Must have two pointers starting from the start of the String and one from the end
     * if the character is non-alphanumeric on either end then skip
     * otherwise compare until left pointer is = right pointer
     *
     *
     * <p>
     * Complexity:
     * Sort: Not required
     * Time: O(n)  Space: O(1)
     */
    public boolean isPalindrome(String s) {

        // A man, a plan, a canal: Panama
        // amanaplanacanalpanama
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            if (!Character.isLetterOrDigit(s.charAt(leftPointer))) {
                leftPointer++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(rightPointer))) {
                rightPointer--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(leftPointer)) != Character.toLowerCase(s.charAt(rightPointer))) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }

        return true;
    }

}
