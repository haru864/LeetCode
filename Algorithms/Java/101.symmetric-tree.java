import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=101 lang=java
 *
 * [101] Symmetric Tree
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

    public boolean isSymmetric(TreeNode root) {

        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();

        isSymmetricHelper(root.left, leftList, -1);
        isSymmetricHelper(root.right, rightList, 1);
        // System.out.println(leftList);
        // System.out.println(rightList);

        if (leftList.size() != rightList.size())
            return false;

        for (int i = 0; i < leftList.size(); i++) {
            if (leftList.get(i).intValue() != rightList.get(i).intValue())
                return false;
        }

        return true;
    }

    public void isSymmetricHelper(TreeNode node, List<Integer> list, int dir) {

        if (node == null) {
            list.add(Integer.MIN_VALUE);
            return;
        }

        list.add(node.val);
        if (dir == -1) {
            isSymmetricHelper(node.left, list, -1);
            isSymmetricHelper(node.right, list, -1);
        } else {
            isSymmetricHelper(node.right, list, 1);
            isSymmetricHelper(node.left, list, 1);
        }

        return;
    }
}
// @lc code=end
