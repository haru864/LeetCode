/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {

    public void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int idx = -1;

            for (int j = i; j < nums.length; j++) {

                if (nums[j] != 0 && idx != -1) {
                    nums[idx] = nums[j];
                    nums[j] = 0;
                    idx = j;
                } else if (nums[j] == 0 && idx == -1) {
                    idx = j;
                }
            }
        }

        return;
    }
}
// @lc code=end
