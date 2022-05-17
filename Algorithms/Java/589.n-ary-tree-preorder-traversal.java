import java.util.ArrayList;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {

    List<Integer> ans;

    public List<Integer> preorder(Node root) {

        ans = new ArrayList<>();
        preorderHelper(root);

        return ans;
    }

    public void preorderHelper(Node node) {

        if (node == null)
            return;
        else
            ans.add(node.val);

        if (node.children == null)
            return;

        for (var n : node.children) {
            preorderHelper(n);
        }

        return;
    }
}
// @lc code=end
