import java.util.ArrayList;
import java.util.Stack;

/*
 * @lc app=leetcode id=989 lang=java
 *
 * [989] Add to Array-Form of Integer
 */

// @lc code=start
class Solution {

    public List<Integer> addToArrayForm(int[] num, int k) {

        Stack<Integer> stack = new Stack<>();
        int carry = 0;

        for (int i = num.length - 1; i >= 0; i--) {

            int n = num[i];
            int m = k % 10;
            k /= 10;

            int sum = n + m + carry;
            stack.add(sum % 10);
            carry = sum / 10;
        }

        while (k > 0) {
            int n = k % 10 + carry;
            stack.add(n % 10);
            carry = n / 10;
            k /= 10;
        }

        if (carry != 0)
            stack.add(carry);

        List<Integer> list = new ArrayList<>();

        while (stack.size() > 0) {
            list.add(stack.pop());
        }

        return list;
    }
}
// @lc code=end
