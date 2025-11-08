package dsa.stack;

import java.util.Stack;

/**
 * Title: Evaluate Reverse Polish Notation (LeetCode 150)   Topic: Stack   Difficulty: Medium
 * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
 *
 * <p>
 * Problem:
 * You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.
 * <p>
 * Evaluate the expression. Return an integer that represents the value of the expression.
 * <p>
 * Note that:
 * <p>
 * - The valid operators are '+', '-', '*', and '/'. <p>
 * - Each operand may be an integer or another expression. <p>
 * - The division between two integers always truncates toward zero. <p>
 * - There will not be any division by zero. <p>
 * - The input represents a valid arithmetic expression in a reverse polish notation. <p>
 * - The answer and all the intermediate calculations can be represented in a 32-bit integer. <p>
 */
public class EvaluateReversePolishNotation {
    /**
     1. Instantiate a Stack
     2. create a function that takes three parameters, (int, int, operator)
     3. the push the returned value back in the stack
     4. keep doing it until the end of the list and return the first element in the stack
     */
    public int evalRPN(String[] tokens) {
        int size = tokens.length;
        if (size < 3) return Integer.parseInt(tokens[size - 1]);

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            if (isOperator(token)) {
                int j = stack.pop();
                int i = stack.pop();
                stack.push(runOperator(i, j, token));
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    private boolean isOperator(String token) {
        return (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/"));
    }

    private int runOperator(int i, int j, String operator) {
        switch (operator) {
            case "+":
                return i + j;
            case "-":
                return i - j;
            case "*":
                return i * j;
            case "/":
                return i / j;
            default:
                throw new IllegalArgumentException("Invalid Operator!");
        }
    }
}
