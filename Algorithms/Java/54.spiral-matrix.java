import java.util.ArrayList;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Point {

    int row;
    int col;

    public Point(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {

    public List<Integer> spiralOrder(int[][] matrix) {

        int h = matrix.length;
        int w = matrix[0].length;

        List<Integer> ans = new ArrayList<>();
        Point p = new Point(0, 0);
        boolean[][] seen = new boolean[matrix.length][matrix[0].length];

        int dir = 0;

        while (p.row >= 0 && p.row < h && p.col >= 0 && p.col < w && seen[p.row][p.col] != true) {

            // System.out.println(p.row + " " + p.col);
            seen[p.row][p.col] = true;
            ans.add(matrix[p.row][p.col]);

            if (dir == 0) {
                if (p.col < w - 1 && seen[p.row][p.col + 1] == false) {
                    p.col++;
                } else {
                    dir = 1;
                    p.row++;
                }
            } else if (dir == 1) {
                if (p.row < h - 1 && seen[p.row + 1][p.col] == false) {
                    p.row++;
                } else {
                    dir = 2;
                    p.col--;
                }
            } else if (dir == 2) {
                if (p.col > 0 && seen[p.row][p.col - 1] == false) {
                    p.col--;
                } else {
                    dir = 3;
                    p.row--;
                }
            } else if (dir == 3) {
                if (p.row > 0 && seen[p.row - 1][p.col] == false) {
                    p.row--;
                } else {
                    dir = 0;
                    p.col++;
                }
            }
        }

        return ans;
    }
}
// @lc code=end
