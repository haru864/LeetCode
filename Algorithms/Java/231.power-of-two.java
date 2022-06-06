/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution {

    public boolean isPowerOfTwo(int n) {

        if (n == 0)
            return false;

        int m = (n < 0) ? -2 : 2;

        while (n > 1) {
            if (n % m == 1)
                return false;
            n /= m;
        }

        return (n == 1);
    }
}
// @lc code=end
