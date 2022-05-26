import java.util.Arrays;

import javax.swing.text.AbstractDocument.LeafElement;

/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {

    public void rotate(int[] nums, int k) {

        int[] temp = new int[nums.length];
        temp = Arrays.copyOf(nums, nums.length);

        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = temp[i];
        }
        // printArr(nums);

        return;
    }

    public void printArr(int[] arr) {

        for (var n : arr) {
            System.out.println(n + " ");
        }
        System.out.println("\n");
    }
}
// @lc code=end
