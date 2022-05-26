/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution {

    public int[] sortedSquares(int[] nums) {

        int[] ans = new int[nums.length];

        int left = 0;
        int right = nums.length - 1;
        int i = right;

        while (left <= right) {

            int n = Math.abs(nums[left]);
            int m = Math.abs(nums[right]);

            if (n >= m) {
                ans[i--] = (int) Math.pow(n, 2);
                left++;
            } else {
                ans[i--] = (int) Math.pow(m, 2);
                right--;
            }
        }

        return ans;
    }
}
// @lc code=end
