import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=102 lang=java
 *
 * [102] Binary Tree Level Order Traversal
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

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        levelOrderHelper(root, ans, 1);

        return ans;
    }

    public void levelOrderHelper(TreeNode node, List<List<Integer>> list, int level) {

        if (node == null)
            return;

        if (list.size() < level) {
            List<Integer> currlist = new ArrayList<>();
            list.add(currlist);
        }

        list.get(level - 1).add(node.val);

        levelOrderHelper(node.left, list, level + 1);
        levelOrderHelper(node.right, list, level + 1);

        return;
    }
}
// @lc code=end
