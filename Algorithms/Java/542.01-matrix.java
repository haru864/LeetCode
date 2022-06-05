import java.util.concurrent.CountDownLatch;

/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start
class Solution {

    public int[][] updateMatrix(int[][] mat) {

        int row = mat.length;
        int column = mat[0].length;
        int[][] ans = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                // System.out.println(i + " " + j + " " + ans[i][j]);
                if (mat[i][j] == 0)
                    continue;
                ans[i][j] = updateMatrixHelper(mat, 0, i, j);
            }
        }

        return ans;
    }

    public int updateMatrixHelper(int[][] mat, int dist, int r, int c) {

        if (r < 0 || r >= mat.length || c < 0 || c >= mat[0].length || dist > 10) {
            return Integer.MAX_VALUE;
        } else if (mat[r][c] == 0) {
            return dist;
        }

        int ret = updateMatrixHelper(mat, dist + 1, r - 1, c);
        ret = Math.min(ret, updateMatrixHelper(mat, dist + 1, r + 1, c));
        ret = Math.min(ret, updateMatrixHelper(mat, dist + 1, r, c - 1));
        ret = Math.min(ret, updateMatrixHelper(mat, dist + 1, r, c + 1));

        return ret;
    }
}
// @lc code=end
