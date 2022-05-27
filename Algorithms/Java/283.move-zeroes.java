import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {

    public void moveZeroes(int[] nums) {

        Queue<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                q.add(i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (!q.isEmpty()) {
                nums[i] = nums[q.poll()];
            } else {
                nums[i] = 0;
            }
        }

        return;
    }
}
// @lc code=end
