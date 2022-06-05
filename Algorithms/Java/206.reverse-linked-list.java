import java.util.ArrayDeque;

import javax.management.ListenerNotFoundException;
import javax.print.attribute.standard.NumberOfInterveningJobs;

/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
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

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode currNode = head;

        while (currNode != null) {
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }

        return prev;
    }
}
// @lc code=end
