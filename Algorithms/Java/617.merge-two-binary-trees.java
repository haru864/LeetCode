import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=617 lang=java
 *
 * [617] Merge Two Binary Trees
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

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        TreeNode dummyNode = new TreeNode(-1);
        TreeNode currNode = dummyNode;

        mergeTreesHelper(currNode, root1, root2, -1);

        return dummyNode.left;
    }

    public void mergeTreesHelper(TreeNode node, TreeNode r1, TreeNode r2, int dir) {

        if (r1 == null && r2 == null)
            return;

        TreeNode currNode;
        if (r1 == null && r2 != null) {
            currNode = new TreeNode(r2.val);
        } else if (r1 != null && r2 == null) {
            currNode = new TreeNode(r1.val);
        } else {
            currNode = new TreeNode(r1.val + r2.val);
        }

        if (dir == -1) {
            node.left = currNode;
            node = node.left;
        } else if (dir == 1) {
            node.right = currNode;
            node = node.right;
        }

        mergeTreesHelper(node, (r1 == null) ? null : r1.left, (r2 == null) ? null : r2.left, -1);
        mergeTreesHelper(node, (r1 == null) ? null : r1.right, (r2 == null) ? null : r2.right, 1);

        return;
    }
}
// @lc code=end
