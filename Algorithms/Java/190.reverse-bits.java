/*
 * @lc app=leetcode id=190 lang=java
 *
 * [190] Reverse Bits
 */

// @lc code=start
public class Solution {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        long ans = 0;

        for (int i = 0; i < 32; i++) {
            // System.out.print((n & 1));
            if ((n & 1) == 1) {
                ans += (long) Math.pow(2, 31 - i);
                // System.out.println(ans);
            }
            n >>>= 1;
        }

        return (int) ans;
    }
}
// @lc code=end
