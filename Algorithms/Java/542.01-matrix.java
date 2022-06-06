import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;

/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start
class Solution {

    int[] ROWS = new int[] { -1, 0, 0, 1 };
    int[] COLS = new int[] { 0, -1, 1, 0 };

    public int[][] updateMatrix(int[][] mat) {

        int height = mat.length;
        int width = mat[0].length;
        int[][] dist = new int[height][width];
        Queue<List<Integer>> q = new ArrayDeque<>();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (mat[i][j] == 0) {
                    dist[i][j] = 0;
                    q.add(Arrays.asList(i, j));
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        while (!q.isEmpty()) {
            List<Integer> currMass = q.remove();
            for (int i = 0; i < 4; i++) {
                int nextRow = currMass.get(0) + ROWS[i];
                int nextCol = currMass.get(1) + COLS[i];
                if (nextCol >= 0 && nextCol < width && nextRow >= 0 && nextRow < height) {
                    if (dist[nextRow][nextCol] > dist[currMass.get(0)][currMass.get(1)] + 1) {
                        dist[nextRow][nextCol] = dist[currMass.get(0)][currMass.get(1)] + 1;
                        q.add(Arrays.asList(nextRow, nextCol));
                    }
                }
            }
        }

        return dist;
    }
}
// @lc code=end
