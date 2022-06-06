import java.time.temporal.ValueRange;
import java.util.HexFormat;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=701 lang=java
 *
 * [701] Insert into a Binary Search Tree
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

    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null)
            return new TreeNode(val);

        TreeNode currNode = root;

        while (currNode != null) {
            if (val < currNode.val) {
                if (currNode.left == null) {
                    currNode.left = new TreeNode(val);
                    break;
                } else {
                    currNode = currNode.left;
                }
            } else if (val > currNode.val) {
                if (currNode.right == null) {
                    currNode.right = new TreeNode(val);
                    break;
                } else {
                    currNode = currNode.right;
                }
            }
        }

        return root;
    }
}
// @lc code=end
