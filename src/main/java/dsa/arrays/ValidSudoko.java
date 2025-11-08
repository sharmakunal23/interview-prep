package dsa.arrays;

/**
 * Title: Valid Sudoku (LeetCode 36)   Topic: Array   Difficulty: Medium <p>
 * Link: https://leetcode.com/problems/valid-sudoku/description/
 *
 * <p>
 * Problem:
 * Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
 * <p>
 * 1. Each row must contain the digits 1-9 without repetition. <p>
 * 2. Each column must contain the digits 1-9 without repetition. <p>
 * 3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition. <p>
 * <b> Note: <b>
 * <p>
 * - A Sudoku board (partially filled) could be valid but is not necessarily solvable. <p>
 * - Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoko {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char ch = board[r][c];
                if (ch == '.') continue;
                int num = ch - '1'; // maps '1'-'9' to 0-8
                int box = (r / 3) * 3 + (c / 3);
                if (rows[r][num] || cols[c][num] || boxes[box][num]) {
                    return false;
                }
                rows[r][num] = cols[c][num] = boxes[box][num] = true;
            }
        }
        return true;
    }
}
