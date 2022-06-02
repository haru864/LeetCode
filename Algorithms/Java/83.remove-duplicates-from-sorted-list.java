import java.util.HashSet;

/*
 * @lc app=leetcode id=83 lang=java
 *
 * [83] Remove Duplicates from Sorted List
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

    public ListNode deleteDuplicates(ListNode head) {

        HashSet<Integer> set = new HashSet<>();
        ListNode currNode = head;
        ListNode prev = null;

        while (currNode != null) {
            if (set.contains(currNode.val)) {
                prev.next = currNode.next;
            } else {
                set.add(currNode.val);
                prev = currNode;
            }
            currNode = currNode.next;
        }

        return head;
    }
}
// @lc code=end
