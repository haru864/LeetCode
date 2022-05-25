/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {

    public int searchInsert(int[] nums, int target) {

        if (target <= nums[0])
            return 0;
        else if (target > nums[nums.length - 1])
            return nums.length;

        int left = 0;
        int right = nums.length - 1;

        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        return right;
    }
}
// @lc code=end
