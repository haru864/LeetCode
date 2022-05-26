/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] nums3 = new int[nums1.length - nums2.length];

        for (int i = 0; i < nums3.length; i++) {
            nums3[i] = nums1[i];
        }

        int a, b;
        a = b = 0;

        for (int i = 0; i < nums1.length; i++) {
            if (a < nums2.length && b < nums3.length) {
                if (nums2[a] < nums3[b]) {
                    nums1[i] = nums2[a++];
                } else {
                    nums1[i] = nums3[b++];
                }
            } else if (a >= nums2.length) {
                nums1[i] = nums3[b++];
            } else {
                nums1[i] = nums2[a++];
            }
        }

        return;
    }
}
// @lc code=end
