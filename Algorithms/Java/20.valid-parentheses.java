import java.util.HashMap;
import java.util.Stack;

import javax.print.attribute.HashAttributeSet;
import javax.swing.plaf.synth.SynthStyleFactory;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.get(ch) == null) {
                stack.add(ch);
            } else {
                if (stack.isEmpty() || stack.peek() != map.get(ch)) {
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
// @lc code=end
