package dsa.graphs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfIslandsTest {

    private NumberOfIslands islands;

    @BeforeEach
    void setUp() {
        islands = new NumberOfIslands();
    }

    @AfterEach
    void tearDown() {
        islands = null;
    }

    @Test
    public void testEmptyGrid() {
        char[][] grid = {};
        NumberOfIslands solution = new NumberOfIslands();
        assertEquals(0, islands.numIslands(grid));
    }

    @Test
    public void testNullGrid() {
        NumberOfIslands solution = new NumberOfIslands();
        assertEquals(0, islands.numIslands(null));
    }

    @Test
    public void testSingleLand() {
        char[][] grid = {{'1'}};
        NumberOfIslands solution = new NumberOfIslands();
        assertEquals(1, islands.numIslands(grid));
    }

    @Test
    public void testSingleWater() {
        char[][] grid = {{'0'}};
        NumberOfIslands solution = new NumberOfIslands();
        assertEquals(0, islands.numIslands(grid));
    }

    @Test
    public void testNoIslands() {
        char[][] grid = {
                {'0', '0', '0'},
                {'0', '0', '0'},
                {'0', '0', '0'}
        };
        NumberOfIslands solution = new NumberOfIslands();
        assertEquals(0, islands.numIslands(grid));
    }

    @Test
    public void testMultipleIslands() {
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        NumberOfIslands solution = new NumberOfIslands();
        assertEquals(3, islands.numIslands(grid));
    }
}