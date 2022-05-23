import java.util.HashMap;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {

    public boolean isAnagram(String s, String t) {

        return sortString(s).equals(sortString(t));
    }

    public String sortString(String s) {

        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
// @lc code=end
