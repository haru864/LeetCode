import java.util.ArrayList;

/*
 * @lc app=leetcode id=784 lang=java
 *
 * [784] Letter Case Permutation
 */

// @lc code=start
class Solution {

    List<String> ans;

    public List<String> letterCasePermutation(String s) {

        ans = new ArrayList<>();
        letterCasePermutationHelper(s, new StringBuilder(), 0);

        return ans;
    }

    public void letterCasePermutationHelper(String s, StringBuilder sb, int index) {

        if (sb.length() == s.length()) {
            ans.add(new String(sb));
            return;
        }

        char ch = s.charAt(index);
        if (isAlphabet(ch)) {
            sb.append(changeChar(ch));
            letterCasePermutationHelper(s, sb, index + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.append(ch);
        letterCasePermutationHelper(s, sb, index + 1);
        sb.deleteCharAt(sb.length() - 1);

        return;
    }

    public char changeChar(char ch) {

        if (ch >= 'a' && ch <= 'z')
            ch = Character.toUpperCase(ch);
        else if (ch >= 'A' && ch <= 'Z')
            ch = Character.toLowerCase(ch);

        return ch;
    }

    public boolean isAlphabet(char ch) {

        if (ch >= 'a' && ch <= 'z')
            return true;
        else if (ch >= 'A' && ch <= 'Z')
            return true;
        else
            return false;
    }
}
// @lc code=end
