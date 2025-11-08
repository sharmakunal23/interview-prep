package dsa.stack;

import java.util.Stack;

/**
 * Title: Daily Temperatures (LeetCode 739)   Topic: Stack   Difficulty: Medium
 * Link: https://leetcode.com/problems/daily-temperatures/description/
 *
 * <p>
 * Problem:
 * Given an array of integers temperatures represents the daily temperatures, return an array answer
 * such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature.
 * If there is no future day for which this is possible, keep answer[i] == 0 instead.
 */
public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] output = new int[size];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < size; i++) {

            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                output[idx] = i - idx;
            }

            stack.push(i);
        }
        return output;
    }
}
