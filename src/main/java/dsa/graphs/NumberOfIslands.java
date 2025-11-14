package dsa.graphs;

public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int rows = grid.length;
        int cols = grid[0].length;
        int islandCount = 0;

        // Check every cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Found unvisited land - new island!
                if (grid[i][j] == '1') {
                    islandCount++;
                    dfs(grid, i, j); // Mark entire island
                }
            }
        }

        return islandCount;
    }

    private void dfs(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        // Base cases: out of bounds or water/visited
        if (row < 0 || row >= rows ||
                col < 0 || col >= cols ||
                grid[row][col] == '0') {
            return;
        }

        // Mark current cell as visited by changing to '0'
        grid[row][col] = '0';

        // Explore all 4 directions (up, down, left, right)
        dfs(grid, row - 1, col); // Up
        dfs(grid, row + 1, col); // Down
        dfs(grid, row, col - 1); // Left
        dfs(grid, row, col + 1); // Right
    }
}
