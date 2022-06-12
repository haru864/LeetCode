import java.util.Stack;

/*
 * @lc app=leetcode id=66 lang=java
 *
 * [66] Plus One
 */

// @lc code=start
class Solution {

    public int[] plusOne(int[] digits) {

        Stack<Integer> stack = new Stack<>();
        boolean carry = true;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = 0;
            if (carry) {
                sum = digits[i] + 1;
            } else {
                sum = digits[i];
            }
            stack.add(sum % 10);
            if (sum >= 10)
                carry = true;
            else
                carry = false;
        }

        if (carry)
            stack.add(1);

        int[] ans = new int[stack.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = stack.pop();
        }

        return ans;
    }
}
// @lc code=end
