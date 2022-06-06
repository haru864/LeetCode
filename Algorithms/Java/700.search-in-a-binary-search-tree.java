import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
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

    public TreeNode searchBST(TreeNode root, int val) {

        return searchBSTHelper(root, val);
    }

    public TreeNode searchBSTHelper(TreeNode node, int target) {

        if (node == null)
            return null;
        else if (node.val == target)
            return node;

        if (node.val < target)
            return searchBSTHelper(node.right, target);
        else if (node.val > target)
            return searchBSTHelper(node.left, target);

        return null;
    }
}
// @lc code=end
