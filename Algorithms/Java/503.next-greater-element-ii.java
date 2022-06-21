import java.util.Stack;

/*
 * @lc app=leetcode id=503 lang=java
 *
 * [503] Next Greater Element II
 */

// @lc code=start
class Solution {

    public int[] nextGreaterElements(int[] nums) {

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = -1;
        }

        Stack<Pair<Integer, Integer>> stack = new Stack<>();
        stack.push(new Pair(nums[0], 0));

        for (int count = 1; count < nums.length * 2; count++) {

            int index = count % nums.length;
            // System.out.println("index: " + index);

            while (stack.size() > 0 && nums[index] > stack.peek().getKey()) {
                if (ans[stack.peek().getValue()] == -1) {
                    ans[stack.peek().getValue()] = nums[index];
                }
                // System.out.println("pop: " + stack.peek().getKey());
                stack.pop();
            }

            if (ans[index] == -1) {
                // System.out.println("push: " + nums[index]);
                stack.push(new Pair(nums[index], index));
            }
        }

        return ans;
    }
}
// @lc code=end
