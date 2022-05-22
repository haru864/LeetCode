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

    public int depth = 0;

    public int maxDepth(TreeNode root) {

        if (root == null)
            return 0;

        maxDepthHelper(root, 0);

        return this.depth;
    }

    public void maxDepthHelper(TreeNode node, int count) {

        count++;
        this.depth = Math.max(this.depth, count);

        if (node.left != null)
            maxDepthHelper(node.left, count);
        if (node.right != null)
            maxDepthHelper(node.right, count);

        return;
    }
}
// @lc code=end
