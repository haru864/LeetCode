import java.util.Comparator;

/*
 * @lc app=leetcode id=1232 lang=java
 *
 * [1232] Check If It Is a Straight Line
 */

// @lc code=start
class Solution {

    public boolean checkStraightLine(int[][] coordinates) {

        Arrays.sort(coordinates, new Comparator<int[]>() {
            @Override
            public int compare(int[] first, int[] second) {
                return (first[0] == second[0]) ? first[1] - second[1] : first[0] - second[0];
            }
        });

        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];
        double slope = (double) dy / dx;

        for (int i = 2; i < coordinates.length; i++) {
            dx = coordinates[i][0] - coordinates[i - 1][0];
            dy = coordinates[i][1] - coordinates[i - 1][1];
            double currSlope = (double) dy / dx;
            if (currSlope != slope)
                return false;
        }

        return true;
    }
}
// @lc code=end
