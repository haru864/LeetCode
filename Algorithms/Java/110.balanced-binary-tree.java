import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=110 lang=java
 *
 * [110] Balanced Binary Tree
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

    public boolean isBalanced(TreeNode root) {

        if (root == null)
            return true;

        int leftHeight = getDepth(root.left, 0);
        int rightHeight = getDepth(root.right, 0);
        // System.out.println(leftHeight + " " + rightHeight);

        return (Math.abs(leftHeight - rightHeight) <= 1) && isBalanced(root.left) && isBalanced(root.right);
    }

    public int getDepth(TreeNode node, int depth) {

        if (node == null)
            return depth;
        // System.out.println(node.val + " " + node.left + " " + node.right);

        return Math.max(getDepth(node.left, depth + 1), getDepth(node.right, depth + 1));
    }
}
// @lc code=end
