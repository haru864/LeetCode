/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {

        int count = 0;
        int tail = s.length() - 1;
        // System.out.println(tail);

        while (s.charAt(tail) == ' ') {
            tail--;
        }
        // System.out.println(tail);

        for (int i = tail; i >= 0; i--) {
            if (s.charAt(i) == ' ')
                break;
            count++;
        }

        return count;
    }
}
// @lc code=end
