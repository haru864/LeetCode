/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {

    boolean hasPath;

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null)
            return false;

        hasPath = false;
        hasPathHelper(root, targetSum, 0);

        return hasPath;
    }

    public void hasPathHelper(TreeNode node, int target, int total) {

        if (node != null && node.left == null && node.right == null) {
            // System.out.println(total);
            if (target == total + node.val)
                hasPath = true;
            return;
        }

        if (node == null)
            return;

        hasPathHelper(node.left, target, total + node.val);
        hasPathHelper(node.right, target, total + node.val);

        return;
    }
}
// @lc code=end
