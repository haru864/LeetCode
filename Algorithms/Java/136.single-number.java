import java.util.HashSet;
import java.util.Iterator;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 */

// @lc code=start
class Solution {

    public int singleNumber(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for (var n : nums) {
            if (hs.contains(n)) {
                hs.remove(n);
            } else {
                hs.add(n);
            }
        }

        Iterator iterator = hs.iterator();
        return (int) iterator.next();
    }
}
// @lc code=end
