/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {

    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int h = mat.length;
        int w = mat[0].length;

        if (r * c != h * w)
            return mat;

        int[][] ans = new int[r][c];
        int count = 0;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                ans[count / c][count % c] = mat[i][j];
                count++;
            }
        }

        return ans;
    }
}
// @lc code=end
