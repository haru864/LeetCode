/*
 * @lc app=leetcode id=1523 lang=java
 *
 * [1523] Count Odd Numbers in an Interval Range
 */

// @lc code=start
class Solution {

    public int countOdds(int low, int high) {
        // OEOEOEOEOEOEOE...

        int ans = 0;

        if (low % 2 == 1 && high % 2 == 1) {
            ans = (high - low) / 2 + 1;
        } else if (low % 2 == 0 && high % 2 == 0) {
            ans = (high - low) / 2;
        } else {
            ans = (high - low + 1) / 2;
        }

        return ans;
    }
}
// @lc code=end
