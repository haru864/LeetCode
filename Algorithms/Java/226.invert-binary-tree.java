import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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

    public TreeNode invertTree(TreeNode root) {

        invertTreeHelper(root);

        return root;
    }

    public void invertTreeHelper(TreeNode node) {

        if (node == null)
            return;

        var temp = node.left;
        node.left = node.right;
        node.right = temp;

        invertTreeHelper(node.left);
        invertTreeHelper(node.right);

        return;
    }
}
// @lc code=end
