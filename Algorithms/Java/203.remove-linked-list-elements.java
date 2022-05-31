import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode id=203 lang=java
 *
 * [203] Remove Linked List Elements
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

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyNode = new ListNode(-1);
        var currNode = dummyNode;

        while (head != null) {
            if (head.val != val) {
                currNode.next = new ListNode(head.val);
                currNode = currNode.next;
            }
            head = head.next;
        }

        return dummyNode.next;
    }
}
// @lc code=end
