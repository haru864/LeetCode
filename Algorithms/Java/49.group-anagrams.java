import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            // System.out.println(arr);
            if (map.get(String.valueOf(arr)) == null) {
                // System.out.println(String.valueOf(arr));
                map.put(String.valueOf(arr), new ArrayList<>());
            }
            map.get(String.valueOf(arr)).add(s);
        }
        // System.out.println(map);

        return new ArrayList<>(map.values());
    }
}
// @lc code=end
