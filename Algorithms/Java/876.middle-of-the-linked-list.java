/*
 * @lc app=leetcode id=876 lang=java
 *
 * [876] Middle of the Linked List
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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        var currNode = head;

        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        System.out.println(count);

        count /= 2;
        while (count > 0) {
            head = head.next;
            count--;
        }

        return head;
    }
}
// @lc code=end
