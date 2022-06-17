/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {

    public void rotate(int[][] matrix) {

        int len = matrix.length;

        for (int r = 0; r < len / 2; r++) {
            // System.out.println(r);
            for (int c = r; c < len - 1 - r; c++) {
                // System.out.println(r + " " + c);
                int temp = matrix[len - 1 - c][r];
                // System.out.println(temp);

                matrix[len - 1 - c][r] = matrix[len - 1 - r][len - 1 - c];
                matrix[len - 1 - r][len - 1 - c] = matrix[c][len - 1 - r];
                matrix[c][len - 1 - r] = matrix[r][c];

                matrix[r][c] = temp;
            }
        }
    }
}
// @lc code=end
