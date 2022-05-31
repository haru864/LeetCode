import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * @lc app=leetcode id=141 lang=java
 *
 * [141] Linked List Cycle
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {

    public boolean hasCycle(ListNode head) {

        ListNode currNode = head;
        int count = 0;

        while (currNode != null) {
            if (count > 1e4)
                return true;
            count++;
            currNode = currNode.next;
        }

        return false;
    }
}
// @lc code=end
