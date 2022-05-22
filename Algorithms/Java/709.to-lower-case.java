/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {

    public String toLowerCase(String s) {

        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {
                sb.setCharAt(i, (char) (sb.charAt(i) - 'A' + 'a'));
            }
        }

        return sb.toString();
    }
}
// @lc code=end
