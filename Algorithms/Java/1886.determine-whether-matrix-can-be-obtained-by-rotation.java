import java.util.Arrays;

/*
 * @lc app=leetcode id=1886 lang=java
 *
 * [1886] Determine Whether Matrix Can Be Obtained By Rotation
 */

// @lc code=start
class Solution {

    public boolean findRotation(int[][] mat, int[][] target) {

        System.out.println(mat);

        for (int i = 0; i < 4; i++) {
            if (isSame(mat, target))
                return true;
            mat = rotate(mat);
            // rotate(mat);
            printMatrix(mat);
        }

        return false;
    }

    public boolean isSame(int[][] mat, int[][] target) {

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] != target[i][j])
                    return false;
            }
        }

        return true;
    }

    public int[][] rotate(int[][] mat) {

        System.out.println(mat);
        int height = mat.length;
        int width = mat[0].length;

        var temp = new int[height][width];
        int count = 0;

        for (int c = 0; c < width; c++) {
            for (int r = height - 1; r >= 0; r--) {
                temp[count / width][count % width] = mat[r][c];
                count++;
            }
        }

        return temp;
    }

    public void printMatrix(int[][] mat) {

        for (int i = 0; i < mat.length; i++) {
            System.out.println(Arrays.toString(mat[i]));
        }
        System.out.println("----------");
    }
}
// @lc code=end
