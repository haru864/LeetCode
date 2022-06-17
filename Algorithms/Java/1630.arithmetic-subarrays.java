import java.util.ArrayList;
import java.util.Arrays;

/*
 * @lc app=leetcode id=1630 lang=java
 *
 * [1630] Arithmetic Subarrays
 */

// @lc code=start
class Solution {

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int left = l[i];
            int right = r[i];
            ans.add(isArithmetic(Arrays.copyOfRange(nums, left, right + 1)));
        }

        return ans;
    }

    public boolean isArithmetic(int[] arr) {

        int[] temp = Arrays.copyOf(arr, arr.length);
        Arrays.sort(temp);

        for (int i = 2; i < temp.length; i++) {
            int n = temp[i] - temp[i - 1];
            int m = temp[1] - temp[0];
            if (n != m)
                return false;
        }

        return true;
    }
}
// @lc code=end
