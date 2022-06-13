import java.util.ArrayDeque;
import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=1367 lang=java
 *
 * [1367] Linked List in Binary Tree
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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

    public boolean isSubPath(ListNode head, TreeNode root) {

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode currNode = q.poll();
            if (currNode.val == head.val && dfs(currNode, head)) {
                return true;
            }
            if (currNode.left != null)
                q.add(currNode.left);
            if (currNode.right != null)
                q.add(currNode.right);
        }

        return false;
    }

    public boolean dfs(TreeNode node, ListNode list) {

        if (list == null)
            return true;
        else if (node == null)
            return false;

        if (node.val != list.val)
            return false;

        return dfs(node.left, list.next) || dfs(node.right, list.next);
    }
}
// @lc code=end
