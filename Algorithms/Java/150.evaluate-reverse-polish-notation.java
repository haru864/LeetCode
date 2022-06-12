import java.util.Stack;

/*
 * @lc app=leetcode id=150 lang=java
 *
 * [150] Evaluate Reverse Polish Notation
 */

// @lc code=start
class Solution {

    public int evalRPN(String[] tokens) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            String s = tokens[i];

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
                String a = stack.pop();
                String b = stack.pop();
                // System.out.println(a + " " + b);
                stack.add(calc(b, a, s));
            } else {
                stack.add(s);
            }
        }

        return Integer.parseInt(stack.peek());
    }

    public String calc(String a, String b, String op) {

        int n = Integer.parseInt(a);
        int m = Integer.parseInt(b);
        // System.out.println(n + " " + m + " " + op);

        int ret = 0;

        if (op.equals("+"))
            ret = n + m;
        if (op.equals("-"))
            ret = n - m;
        if (op.equals("*"))
            ret = n * m;
        if (op.equals("/"))
            ret = n / m;
        // System.out.println(ret);

        return String.valueOf(ret);
    }
}
// @lc code=end
