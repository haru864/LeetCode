import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
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

    public int maxDepth(TreeNode root) {

        return maxDepthHelper(root, 1);
    }

    public int maxDepthHelper(TreeNode node, int depth) {

        if (node == null)
            return depth - 1;

        int leftDepth = maxDepthHelper(node.left, depth + 1);
        int rightDepth = maxDepthHelper(node.right, depth + 1);

        return Math.max(leftDepth, rightDepth);
    }
}
// @lc code=end
