/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution {

    public int maxProfit(int[] prices) {

        int ans = 0;
        int min = Integer.MAX_VALUE;

        for (int n : prices) {
            ans = Math.max(ans, n - min);
            min = Math.min(min, n);
        }

        return ans;
    }
}
// @lc code=end
