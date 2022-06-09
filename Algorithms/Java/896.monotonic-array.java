import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=896 lang=java
 *
 * [896] Monotonic Array
 */

// @lc code=start
class Solution {

    public boolean isMonotonic(int[] nums) {

        if (nums.length <= 2)
            return true;

        List<Integer> list = new ArrayList<>();
        for (int n : nums) {
            if (list.size() > 0 && list.get(list.size() - 1) == n)
                continue;
            list.add(n);
            System.out.print(list.get(list.size() - 1));
        }

        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i) - list.get(i - 1) > 0 && list.get(i + 1) - list.get(i) < 0)
                return false;
            if (list.get(i) - list.get(i - 1) < 0 && list.get(i + 1) - list.get(i) > 0)
                return false;
        }

        return true;
    }
}
// @lc code=end
