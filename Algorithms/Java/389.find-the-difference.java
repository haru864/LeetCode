import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {

    public char findTheDifference(String s, String t) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        System.out.print(map);

        for (int i = 0; i < t.length(); i++) {
            if (map.get(t.charAt(i)) == null || map.get(t.charAt(i)) == 0)
                return t.charAt(i);
            map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
        }

        return ' ';
    }
}
// @lc code=end
