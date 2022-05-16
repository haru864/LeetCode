/*
 * @lc app=leetcode id=1822 lang=java
 *
 * [1822] Sign of the Product of an Array
 */

// @lc code=start
class Solution {

    public int arraySign(int[] nums) {

        int negCnt = 0;

        for (int n : nums) {
            if (n == 0)
                return 0;
            if (n < 0)
                negCnt++;
        }

        return (negCnt % 2 == 1) ? -1 : 1;
    }
}
// @lc code=end
