/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {

    public int expandAroundCenter(String s, int left, int right) {

        int i = left;
        int j = right;

        while (i >= 0 && j < s.length()) {
            if (s.charAt(i) != s.charAt(j)) {
                break;
            }
            i--;
            j++;
        }

        if (i < 0 || j >= s.length() || s.charAt(i) != s.charAt(j)) {
            i++;
            j--;
        }
        // System.out.println(i + ", " + j);

        return j - i + 1;
    }

    public String longestPalindrome(String s) {

        String ret = "";

        for (int i = 0; i < s.length(); i++) {
            int L1 = expandAroundCenter(s, i, i);
            int L2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(L1, L2);
            if (len > ret.length()) {
                // System.out.println(len);
                int left = i - (len - 1) / 2;
                int right = i + len / 2;
                // System.out.println(left + ", " + right);
                ret = s.substring(left, right + 1);
            }
        }

        return ret;
    }
}
// @lc code=end
