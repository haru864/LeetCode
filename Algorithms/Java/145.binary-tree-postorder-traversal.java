import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=145 lang=java
 *
 * [145] Binary Tree Postorder Traversal
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

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        postorderTraversalHelper(root, ans);

        return ans;
    }

    public void postorderTraversalHelper(TreeNode node, List<Integer> list) {

        if (node == null)
            return;

        postorderTraversalHelper(node.left, list);
        postorderTraversalHelper(node.right, list);
        list.add(node.val);

        return;
    }
}
// @lc code=end
