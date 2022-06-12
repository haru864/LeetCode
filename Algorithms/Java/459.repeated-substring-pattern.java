/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

// @lc code=start
class Solution {

    public boolean repeatedSubstringPattern(String s) {

        for (int dist = 1; dist <= s.length() / 2; dist++) {

            if (s.length() % dist != 0)
                continue;

            boolean flag = true;

            for (int j = 0; j < dist; j++) {
                // System.out.println(s.substring(0, dist));
                // System.out.println(repeatedSubstringPatternHelper(s, 0, dist));
                if (!repeatedSubstringPatternHelper(s, j, dist))
                    flag = false;
            }

            if (flag)
                return true;
        }

        return false;
    }

    public boolean repeatedSubstringPatternHelper(String s, int currPos, int dist) {

        if (currPos >= s.length())
            return true;

        if (currPos + dist < s.length() && s.charAt(currPos) != s.charAt(currPos + dist))
            return false;

        return repeatedSubstringPatternHelper(s, currPos + dist, dist);
    }
}
// @lc code=end
