import java.time.chrono.MinguoChronology;

import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
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

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyNode = new ListNode(0);
        var tempNode = dummyNode;

        while (list1 != null || list2 != null) {

            int v1 = (list1 == null) ? Integer.MAX_VALUE : list1.val;
            int v2 = (list2 == null) ? Integer.MAX_VALUE : list2.val;

            if (v1 > v2) {
                tempNode.next = list2;
                list2 = list2.next;
            } else {
                tempNode.next = list1;
                list1 = list1.next;
            }

            tempNode = tempNode.next;
        }
        // System.out.println(tempNode.val);

        return dummyNode.next;
    }
}
// @lc code=end
