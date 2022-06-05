import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {

    List<List<Integer>> ans;

    public List<List<Integer>> combine(int n, int k) {

        ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        combineHelper(list, 1, n, k);

        return ans;
    }

    public void combineHelper(List<Integer> list, int curr, int max, int k) {

        if (list.size() == k) {
            ans.add(list);
            return;
        }

        for (int i = curr; i <= max; i++) {
            List<Integer> copyList = new ArrayList<>(list);
            copyList.add(i);
            combineHelper(copyList, i + 1, max, k);
        }

        return;
    }
}
// @lc code=end
