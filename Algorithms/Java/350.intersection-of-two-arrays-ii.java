import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (var n : nums1) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        ArrayList<Integer> darr = new ArrayList<>();

        for (var n : nums2) {
            if (map.getOrDefault(n, 0) >= 1) {
                darr.add(n);
                map.put(n, map.get(n) - 1);
            }
        }

        return convertArray(darr);
    }

    public int[] convertArray(ArrayList<Integer> darr) {

        int[] ret = new int[darr.size()];

        for (int i = 0; i < darr.size(); i++) {
            ret[i] = darr.get(i).intValue();
        }

        return ret;
    }
}
// @lc code=end
