/*
 * @lc app=leetcode id=1572 lang=java
 *
 * [1572] Matrix Diagonal Sum
 */

// @lc code=start
class Solution {

    public int diagonalSum(int[][] mat) {

        int total = 0;
        int dist = mat.length - 1;

        for (int i = 0; i < mat.length; i++) {
            int left = i;
            int right = left + dist;
            if (left == right) {
                total += mat[i][left];
            } else {
                total += mat[i][left] + mat[i][right];
            }
            dist -= 2;
        }

        return total;
    }
}
// @lc code=end
