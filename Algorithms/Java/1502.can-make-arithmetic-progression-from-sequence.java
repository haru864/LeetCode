/*
 * @lc app=leetcode id=1502 lang=java
 *
 * [1502] Can Make Arithmetic Progression From Sequence
 */

// @lc code=start
class Solution {

    public boolean canMakeArithmeticProgression(int[] arr) {

        Arrays.sort(arr);

        for (int i = 2; i < arr.length; i++) {

            int n = Math.abs(arr[0] - arr[1]);
            int m = Math.abs(arr[i] - arr[i - 1]);

            if (n != m)
                return false;
        }

        return true;
    }
}
// @lc code=end
