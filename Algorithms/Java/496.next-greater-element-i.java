import java.util.HashMap;

import javax.management.MBeanAttributeInfo;
import javax.print.attribute.HashAttributeSet;

/*
 * @lc app=leetcode id=496 lang=java
 *
 * [496] Next Greater Element I
 */

// @lc code=start
class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (var n : nums1) {
            for (int i = 0; i < nums2.length; i++) {
                if (n == nums2[i]) {
                    map.put(n, i);
                }
            }
        }

        for (int i = 0; i < nums1.length; i++) {
            int n = -1;
            for (int j = map.get(nums1[i]); j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    n = nums2[j];
                    break;
                }
            }
            ans[i] = n;
        }

        return ans;
    }
}
// @lc code=end
