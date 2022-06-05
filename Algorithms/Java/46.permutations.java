import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {

    List<List<Integer>> ans;

    public List<List<Integer>> permute(int[] nums) {

        ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];

        permuteHelper(nums, list, seen);

        return ans;
    }

    public void permuteHelper(int[] nums, List<Integer> list, boolean[] seen) {

        if (list.size() == nums.length) {
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (seen[i])
                continue;
            list.add(nums[i]);
            seen[i] = true;
            permuteHelper(nums, list, seen);
            list.remove(list.size() - 1);
            seen[i] = false;
        }

        return;
    }
}
// @lc code=end
