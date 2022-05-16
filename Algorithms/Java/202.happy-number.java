import java.util.HashMap;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution {

    public boolean isHappy(int n) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        while (true) {
            int sum = 0;
            while (n > 0) {
                sum += Math.pow(n % 10.0, 2.0);
                n /= 10;
            }

            if (sum == 1)
                return true;
            if (map.get(sum) != null)
                return false;
            map.put(sum, true);
            n = sum;
        }

    }
}
// @lc code=end
