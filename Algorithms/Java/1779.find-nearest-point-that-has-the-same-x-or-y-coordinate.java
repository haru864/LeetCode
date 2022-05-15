/*
 * @lc app=leetcode id=1779 lang=java
 *
 * [1779] Find Nearest Point That Has the Same X or Y Coordinate
 */

// @lc code=start
class Solution {

    public int nearestValidPoint(int x, int y, int[][] points) {

        int dist = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < points.length; i++) {
            int X, Y;
            X = points[i][0];
            Y = points[i][1];
            if (X != x && Y != y)
                continue;

            if (X == x && dist > Math.abs(Y - y)) {
                dist = Math.min(dist, Math.abs(Y - y));
                index = i;
            } else if (Y == y && dist > Math.abs(X - x)) {
                dist = Math.min(dist, Math.abs(X - x));
                index = i;
            }
        }

        return index;
    }
}
// @lc code=end
