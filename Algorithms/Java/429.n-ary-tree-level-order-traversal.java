import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode id=429 lang=java
 *
 * [429] N-ary Tree Level Order Traversal
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

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        if (root == null)
            return ans;

        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        q.add(new Node(-1));

        while (!q.isEmpty()) {

            Node currNode = q.poll();
            list.add(currNode.val);
            // System.out.println(list);

            if (currNode.val == -1) {
                list.remove(list.size() - 1);
                ans.add(new ArrayList<>(list));
                list.clear();
                if (q.size() > 0)
                    q.add(new Node(-1));
                continue;
            }

            if (currNode.children != null) {
                for (int i = 0; i < currNode.children.size(); i++) {
                    q.add(currNode.children.get(i));
                }
            }
        }

        return ans;
    }
}
// @lc code=end
