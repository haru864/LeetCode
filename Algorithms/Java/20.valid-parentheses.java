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

        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            var c = s.charAt(i);
            if (map.get(c) != null) {
                if (stack.isEmpty() || stack.peek() != map.get(c))
                    return false;
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
// @lc code=end
