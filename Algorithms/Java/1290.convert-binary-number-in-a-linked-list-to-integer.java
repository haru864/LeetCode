import java.util.Stack;

/*
 * @lc app=leetcode id=1290 lang=java
 *
 * [1290] Convert Binary Number in a Linked List to Integer
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public int getDecimalValue(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        var currNode = head;

        while (currNode != null) {
            stack.push(currNode.val);
            currNode = currNode.next;
        }

        int decTotal = 0;
        int v = 1;

        while (!stack.isEmpty()) {
            decTotal += v * stack.pop();
            v *= 2;
        }

        return decTotal;
    }
}
// @lc code=end
