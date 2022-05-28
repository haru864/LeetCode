import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import javax.naming.LimitExceededException;
import javax.swing.event.ListDataEvent;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            if (i != 0) {
                for (int j = 1; j < i; j++) {
                    temp.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
                temp.add(1);
            }

            ans.add(temp);
        }

        return ans;
    }
}
// @lc code=end
