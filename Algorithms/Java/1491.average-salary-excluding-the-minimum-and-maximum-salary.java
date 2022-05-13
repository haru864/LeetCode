import java.text.DecimalFormat;

/*
 * @lc app=leetcode id=1491 lang=java
 *
 * [1491] Average Salary Excluding the Minimum and Maximum Salary
 */

// @lc code=start
class Solution {

    public double average(int[] salary) {

        int max = 0;
        int min = Integer.MAX_VALUE;
        int amount = 0;

        for (int n : salary) {
            max = Math.max(max, n);
            min = Math.min(min, n);
            amount += n;
        }

        double average = (double) (amount - max - min) / (salary.length - 2);
        DecimalFormat df = new DecimalFormat("#.#####");

        return Double.parseDouble(df.format(average));
    }
}
// @lc code=end
