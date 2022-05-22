import java.util.Stack;

/*
 * @lc app=leetcode id=1309 lang=java
 *
 * [1309] Decrypt String from Alphabet to Integer Mapping
 */

// @lc code=start
class Solution {

    public String freqAlphabets(String s) {

        Stack<Integer> stack = new Stack<>();

        int i = s.length() - 1;
        while (i >= 0) {
            char ch = s.charAt(i);
            if (ch == '#') {
                char[] charArr = new char[] { s.charAt(i - 2), s.charAt(i - 1) };
                stack.push(Integer.parseInt(new String(charArr)) - 1);
                i -= 3;
            } else {
                stack.push((int) (ch - '1'));
                i--;
            }
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.append((char) (stack.pop() + 'a'));
        }

        return sb.toString();
    }
}
// @lc code=end
