import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

import org.w3c.dom.Node;

/*
 * @lc app=leetcode id=116 lang=java
 *
 * [116] Populating Next Right Pointers in Each Node
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    public Node connect(Node root) {

        if (root == null)
            return null;

        ArrayList<Node> darr = new ArrayList<>();
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node currNode = q.poll();
            darr.add(currNode);
            if (currNode.left != null)
                q.add(currNode.left);
            if (currNode.right != null)
                q.add(currNode.right);
        }

        int index = 0;

        for (int i = 2;; i *= 2) {

            index += i;
            if (index >= darr.size())
                break;
            Node tempNode = null;
            // System.out.println(index + " " + (index - i));

            for (int j = index; j > index - i; j--) {

                darr.get(j).next = tempNode;
                tempNode = darr.get(j);
            }
        }

        return root;
    }
}
// @lc code=end
