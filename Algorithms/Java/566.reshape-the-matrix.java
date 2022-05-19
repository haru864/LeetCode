/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int[][] ans = new int[r][c];
        int idx = 0;
        int h = mat.length;
        int w = mat[0].length;

        if (h * w != r * c)
            return mat;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[idx / c][idx % c] = mat[i][j];
                idx++;
            }
        }

        return ans;
    }
}
// @lc code=end
