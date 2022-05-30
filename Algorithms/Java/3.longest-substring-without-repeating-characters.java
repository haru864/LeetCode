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

        int left = -1;
        int right = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        while (right < s.length()) {
            char ch = s.charAt(right);
            System.out.println(ch + " " + map.getOrDefault(ch, -1));
            if (map.get(ch) != null) {
                left = Math.max(left, map.get(ch));
            }
            map.put(ch, right);
            System.out.println(left + " " + right);
            max = Math.max(max, right - left);
            right++;
        }

        return max;
    }
}
// @lc code=end
