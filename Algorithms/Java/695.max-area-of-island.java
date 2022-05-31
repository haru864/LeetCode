/*
 * @lc app=leetcode id=695 lang=java
 *
 * [695] Max Area of Island
 */

// @lc code=start
class Solution {

    int h;
    int w;

    public int maxAreaOfIsland(int[][] grid) {

        h = grid.length;
        w = grid[0].length;
        boolean[][] seen = new boolean[h][w];
        int ans = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int[] count = new int[1];
                bfs(grid, i, j, seen, count);
                // System.out.println(count[0]);
                ans = Math.max(ans, count[0]);
            }
        }

        return ans;
    }

    public void bfs(int[][] grid, int r, int c, boolean[][] seen, int[] count) {

        if (seen[r][c] || grid[r][c] != 1)
            return;
        count[0]++;
        seen[r][c] = true;
        if (r - 1 >= 0)
            bfs(grid, r - 1, c, seen, count);
        if (r + 1 < h)
            bfs(grid, r + 1, c, seen, count);
        if (c - 1 >= 0)
            bfs(grid, r, c - 1, seen, count);
        if (c + 1 < w)
            bfs(grid, r, c + 1, seen, count);
        return;
    }
}
// @lc code=end
