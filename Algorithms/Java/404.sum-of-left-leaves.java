import javax.swing.plaf.basic.BasicTreeUI.TreeCancelEditingAction;
import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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

    public int total = 0;

    public int sumOfLeftLeaves(TreeNode root) {

        sumOfLeftLeavesHelper(root);

        return total;
    }

    public void sumOfLeftLeavesHelper(TreeNode node) {
        // System.out.print(node.val);

        if (node.left != null && node.left.left == null && node.left.right == null) {
            total += node.left.val;
        }

        if (node.left != null)
            sumOfLeftLeavesHelper(node.left);
        if (node.right != null)
            sumOfLeftLeavesHelper(node.right);

        return;
    }
}
// @lc code=end
