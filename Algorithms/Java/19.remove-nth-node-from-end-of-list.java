import java.util.spi.CurrencyNameProvider;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int count = 0;
        ListNode currNode = head;

        while (currNode != null) {
            count++;
            currNode = currNode.next;
        }
        // System.out.println(count);

        int order = count - n;
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode ans = prev;
        currNode = head;
        // System.out.println(order);

        while (order >= 0) {
            if (order == 0) {
                prev.next = (currNode.next != null) ? currNode.next : null;
                break;
            }
            prev = currNode;
            currNode = (currNode.next != null) ? currNode.next : null;
            order--;
        }

        return ans.next;
    }
}
// @lc code=end
