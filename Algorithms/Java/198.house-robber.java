/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution {

    public int rob(int[] nums) {

        int[] arr = new int[nums.length + 1];
        arr[0] = 0;
        arr[1] = nums[0];

        for (int i = 2; i <= nums.length; i++) {
            arr[i] = Math.max(arr[i - 1], arr[i - 2] + nums[i - 1]);
            // System.out.println(arr[i]);
        }

        return arr[nums.length];
    }
}
// @lc code=end
