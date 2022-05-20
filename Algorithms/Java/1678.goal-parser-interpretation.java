/*
 * @lc app=leetcode id=1678 lang=java
 *
 * [1678] Goal Parser Interpretation
 */

// @lc code=start
class Solution {

    public String interpret(String command) {

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < command.length()) {

            char ch = command.charAt(i);

            if (ch == 'G') {
                sb.append('G');
                i++;
            } else if (ch == '(') {
                if (command.charAt(i + 1) == 'a') {
                    sb.append("al");
                    i += 4;
                } else {
                    sb.append('o');
                    i += 2;
                }
            }
        }

        return new String(sb);
    }
}
// @lc code=end
