import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.AppConfigurationEntry;
import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=98 lang=java
 *
 * [98] Validate Binary Search Tree
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

    public boolean isValidBST(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        isValidBSTHelper(root, list);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1))
                return false;
        }

        return true;
    }

    public void isValidBSTHelper(TreeNode node, List<Integer> list) {

        if (node == null)
            return;

        isValidBSTHelper(node.left, list);
        list.add(node.val);
        isValidBSTHelper(node.right, list);

        return;
    }
}
// @lc code=end
