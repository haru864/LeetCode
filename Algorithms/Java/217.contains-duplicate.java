import java.util.HashMap;

/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (var n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (var key : map.keySet()) {
            if (map.get(key) >= 2)
                return true;
        }

        return false;
    }
}
// @lc code=end
