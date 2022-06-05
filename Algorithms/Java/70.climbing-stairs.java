import java.util.ArrayList;

/*
 * @lc app=leetcode id=70 lang=java
 *
 * [70] Climbing Stairs
 */

// @lc code=start
class Solution {

    public int climbStairs(int n) {

        int[] arr = new int[n + 1];
        arr[0] = 1;

        for (int i = 1; i <= n; i++) {
            arr[i] = arr[i - 1];
            if (i > 1)
                arr[i] += arr[i - 2];
        }

        return arr[n];
    }

}
// @lc code=end
