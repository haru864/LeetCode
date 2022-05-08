import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {

    public int lengthOfLongestSubstring(String s) {

        int maxLength = 0;
        int head = 0;
        int tail = 0;
        HashMap<Character, Boolean> seen = new HashMap<>();

        while (tail < s.length()) {
            while (seen.get(s.charAt(tail)) != null) {
                head++;
                seen.remove(s.charAt(head - 1));
            }
            // System.out.println(head + ", " + tail);
            maxLength = Math.max(maxLength, tail - head + 1);
            seen.put(s.charAt(tail), true);
            tail++;
        }

        return maxLength;
    }
}
// @lc code=end
