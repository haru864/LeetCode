import java.nio.BufferOverflowException;

/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

// @lc code=start
class Solution {

    public int orangesRotting(int[][] grid) {

        return orangesRottingHelper(grid, 0);
    }

    public int orangesRottingHelper(int[][] grid, int count) {

        if (!hasFresh(grid))
            return count;

    }

    public boolean hasFresh(int[][] grid) {

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    return ture;
            }
        }

        return false;
    }
}
// @lc code=end
