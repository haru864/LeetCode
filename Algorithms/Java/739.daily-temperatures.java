import java.util.Stack;

/*
 * @lc app=leetcode id=739 lang=java
 *
 * [739] Daily Temperatures
 */

// @lc code=start
class Solution {

    public int[] dailyTemperatures(int[] temperatures) {

        int[] ans = new int[temperatures.length];
        int idx = 0;

        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        stack.add(new Pair(temperatures[0], 0));

        for (int i = 1; i < temperatures.length; i++) {

            while (stack.size() > 0 && stack.peek().getKey() < temperatures[i]) {
                ans[stack.peek().getValue()] = i - stack.peek().getValue();
                stack.pop();
            }

            stack.add(new Pair(temperatures[i], i));
        }

        return ans;
    }
}
// @lc code=end
