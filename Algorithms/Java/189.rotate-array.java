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

        k = k % nums.length;
        int count = 0;

        for (int start = 0; count < nums.length; start++) {

            int current = start;
            int prev = nums[start];

            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
                printArr(nums);
            } while (start != current);
        }
    }

    public void printArr(int[] arr) {

        for (var n : arr) {
            System.out.print(n);
        }
        System.out.println();
    }
}
// @lc code=end
