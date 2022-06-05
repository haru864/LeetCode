import java.util.ArrayList;

/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

// @lc code=start
class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {

        var temp = new ArrayList<>(triangle);

        if (triangle.size() == 1)
            return triangle.get(0).get(0);

        for (int i = 1; i < temp.size(); i++) {
            for (int j = 0; j < temp.get(i).size(); j++) {
                if (j > 0 && j < temp.get(i).size() - 1) {
                    int n = Math.min(temp.get(i - 1).get(j - 1), temp.get(i - 1).get(j));
                    temp.get(i).set(j, n + triangle.get(i).get(j));
                } else if (j == 0) {
                    temp.get(i).set(j, temp.get(i).get(j) + triangle.get(i - 1).get(j));
                } else {
                    temp.get(i).set(j, temp.get(i).get(j) + triangle.get(i - 1).get(j - 1));
                }
            }
        }
        // printArr(temp);

        int ans = Integer.MAX_VALUE;
        int len = temp.size();
        for (int i = 0; i < temp.get(len - 1).size(); i++) {
            ans = Math.min(ans, temp.get(len - 1).get(i));
        }

        return ans;
    }

    public void printArr(List<List<Integer>> darr) {

        for (int i = 0; i < darr.size(); i++) {
            for (int j = 0; j < darr.get(i).size(); j++) {
                System.out.print(darr.get(i).get(j) + " ");
            }
            System.out.print("\n");
        }
    }
}
// @lc code=end
