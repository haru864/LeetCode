import java.util.HashSet;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
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

    public boolean findTarget(TreeNode root, int k) {

        HashSet<Integer> hs = new HashSet<>();

        return findTargetHelper(root, k, hs);
    }

    public boolean findTargetHelper(TreeNode node, int k, HashSet<Integer> hs) {

        if (node == null)
            return false;

        if (hs.contains(k - node.val))
            return true;

        hs.add(node.val);

        return findTargetHelper(node.left, k, hs) || findTargetHelper(node.right, k, hs);
    }
}
// @lc code=end
