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

        if (head == null)
            return null;

        Queue<ListNode> q = new ArrayDeque<>();
        q.add(head);
        ListNode prev = null;

        while (q.size() > 0) {
            ListNode currNode = q.poll();
            ListNode next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            if (next == null)
                return currNode;
            else
                q.add(next);
        }

        return null;
    }
}
// @lc code=end
