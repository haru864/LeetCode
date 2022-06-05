import java.util.ArrayList;

/*
 * @lc app=leetcode id=144 lang=java
 *
 * [144] Binary Tree Preorder Traversal
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

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        preorderTraversalHelper(root, ans);

        return ans;
    }

    public void preorderTraversalHelper(TreeNode node, List<Integer> list) {

        if (node == null)
            return;

        list.add(node.val);
        preorderTraversalHelper(node.left, list);
        preorderTraversalHelper(node.right, list);

        return;
    }
}
// @lc code=end
