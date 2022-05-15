import java.util.Arrays;

/*
 * @lc app=leetcode id=976 lang=java
 *
 * [976] Largest Perimeter Triangle
 */

// @lc code=start
class Solution {

    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            int a, b, c;
            a = nums[i];
            b = nums[i - 1];
            c = nums[i - 2];
            if (a >= b + c)
                continue;
            return a + b + c;
        }

        return 0;
    }
}
// @lc code=end
