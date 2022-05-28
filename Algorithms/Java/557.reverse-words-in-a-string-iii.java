/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {

    public String reverseWords(String s) {

        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ' || i == s.length() - 1) {

                if (i == s.length() - 1)
                    sb.append(s.charAt(i));
                sb.reverse();
                ans.append(sb);
                ans.append((i == s.length() - 1) ? "" : " ");
                sb.delete(0, sb.length());

            } else {

                sb.append(s.charAt(i));
            }
        }

        return ans.toString();
    }
}
// @lc code=end
