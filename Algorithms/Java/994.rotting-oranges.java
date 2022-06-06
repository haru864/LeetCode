import java.nio.BufferOverflowException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

// @lc code=start
class Solution {

    int[] ROWS = new int[] { -1, 0, 0, 1 };
    int[] COLS = new int[] { 0, -1, 1, 0 };
    int HEIGHT;
    int WIDTH;

    public int orangesRotting(int[][] grid) {

        Queue<List<Integer>> q = new ArrayDeque<>();
        int freshOranges = 0;
        this.HEIGHT = grid.length;
        this.WIDTH = grid[0].length;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1)
                    freshOranges++;
                else if (grid[i][j] == 2)
                    q.add(new ArrayList<>(Arrays.asList(i, j)));
            }
        }
        q.add(new ArrayList<>(Arrays.asList(-1, -1)));
        // System.out.println("freshOranges: " + freshOranges + ", Queue_SIZE: " +
        // q.size());

        int count = 0;
        while (q.size() > 0) {
            List<Integer> currMass = q.remove();
            // System.out.println(freshOranges + " " + currMass.get(0) + " " +
            // currMass.get(1));
            if (currMass.get(0) == -1) {
                if (q.size() == 0) {
                    if (freshOranges == 0)
                        break;
                    else
                        return -1;
                }
                count++;
                q.add(new ArrayList<>(Arrays.asList(-1, -1)));
                continue;
            }
            for (int i = 0; i < 4; i++) {
                int nextRow = currMass.get(0) + ROWS[i];
                int nextCol = currMass.get(1) + COLS[i];
                if (nextRow >= 0 && nextRow < HEIGHT && nextCol >= 0 && nextCol < WIDTH
                        && grid[nextRow][nextCol] == 1) {
                    freshOranges--;
                    q.add(new ArrayList<>(Arrays.asList(nextRow, nextCol)));
                    grid[nextRow][nextCol] = 2;
                    // System.out.println("add " + nextRow + " " + nextCol + " " + freshOranges);
                }
            }
        }

        return count;
    }
}
// @lc code=end
