import java.util.Stack;

/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {

    public String addBinary(String a, String b) {

        Stack<Integer> result = new Stack<>();
        int tail1 = a.length() - 1;
        int tail2 = b.length() - 1;
        int carry = 0;

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {

            int n, m;

            if (i > tail1) {
                n = 0;
            } else {
                n = Character.getNumericValue(a.charAt(tail1 - i));
            }

            if (i > tail2) {
                m = 0;
            } else {
                m = Character.getNumericValue(b.charAt(tail2 - i));
            }

            int sum = n + m + carry;
            result.add(sum % 2);
            if (sum > 1)
                carry = 1;
            else
                carry = 0;
        }

        if (carry != 0)
            result.add(carry);

        StringBuilder sb = new StringBuilder();

        while (result.size() > 0) {
            sb.append(String.valueOf(result.pop()));
        }

        return sb.toString();
    }
}
// @lc code=end
