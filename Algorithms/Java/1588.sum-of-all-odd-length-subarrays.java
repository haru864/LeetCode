/*
 * @lc app=leetcode id=1588 lang=java
 *
 * [1588] Sum of All Odd Length Subarrays
 */

// @lc code=start
class Solution {

    public int sumOddLengthSubarrays(int[] arr) {

        int total = 0;

        for (int i = 0; i < arr.length; i++) {

            int temp = 0;

            for (int j = i; j < arr.length; j++) {

                temp += arr[j];
                if ((j - i) % 2 == 0) {
                    total += temp;
                    // System.out.println(temp);
                }
            }
        }

        return total;
    }
}
// @lc code=end
