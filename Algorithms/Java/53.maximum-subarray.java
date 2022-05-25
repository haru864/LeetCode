/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution {

    public int maxSubArray(int[] nums) {

        int ans = nums[0];
        int temp = nums[0];

        for (int i = 1; i < nums.length; i++) {
            temp = Math.max(temp + nums[i], nums[i]);
            ans = Math.max(ans, temp);
        }

        return ans;
    }
}
// @lc code=end
