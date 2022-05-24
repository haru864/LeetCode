import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;

/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

// @lc code=start
class NumArray {

    int[] arr;
    int[] sumArr;

    public NumArray(int[] nums) {

        arr = Arrays.copyOf(nums, nums.length);
        sumArr = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            sumArr[i] = sum;
        }
    }

    public int sumRange(int left, int right) {

        return sumArr[right] - sumArr[left] + arr[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
// @lc code=end
