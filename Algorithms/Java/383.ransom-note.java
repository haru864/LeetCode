import java.util.HashMap;

import javax.print.attribute.HashAttributeSet;

/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);
            if (map.get(ch) == null || map.get(ch) < 1) {
                return false;
            }
            map.put(ch, map.getOrDefault(ch, 0) - 1);
        }

        return true;
    }
}
// @lc code=end
