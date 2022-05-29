/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {

    public boolean searchMatrix(int[][] matrix, int target) {

        int h = matrix.length;
        int w = matrix[0].length;

        for (int i = 0; i < h; i++) {
            if (target < matrix[i][0] || target > matrix[i][w - 1])
                continue;
            // System.out.println("i: " + i);
            return binarySerch(matrix[i], target);
        }

        return false;
    }

    public boolean binarySerch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        // System.out.println("L: " + left + " R: " + right);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            // System.out.println("mid: " + mid);
            if (arr[mid] == target)
                return true;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
// @lc code=end
