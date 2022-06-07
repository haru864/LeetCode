/*
 * @lc app=leetcode id=235 lang=java
 *
 * [235] Lowest Common Ancestor of a Binary Search Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return lowestCommonAncestorHelper(root, Math.min(p.val, q.val), Math.max(p.val, q.val));
    }

    public TreeNode lowestCommonAncestorHelper(TreeNode node, int low, int high) {

        if ((node.val > low && node.val < high) || (low == node.val) || (high == node.val))
            return node;

        if (node.val > low && node.val > high)
            return lowestCommonAncestorHelper(node.left, low, high);
        else if (node.val < low && node.val < high)
            return lowestCommonAncestorHelper(node.right, low, high);

        return null;
    }
}
// @lc code=end
