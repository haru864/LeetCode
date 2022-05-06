import java.util.ArrayList;

import javax.management.ListenerNotFoundException;

/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
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
    public void getTotalOfNodes(ListNode node, ArrayList<Integer> list) {
        list.add(node.val);
        if (node.next == null) {
            return;
        } else {
            getTotalOfNodes(node.next, list);
        }
    }

    public void printArr(ArrayList<Integer> list) {
        for (var v : list) {
            System.out.print(v);
        }
        System.out.print("\n");
        return;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> darr1 = new ArrayList<>();
        ArrayList<Integer> darr2 = new ArrayList<>();
        getTotalOfNodes(l1, darr1);
        getTotalOfNodes(l2, darr2);

        if (darr1.size() < darr2.size()) {
            var temp = darr1;
            darr1 = darr2;
            darr2 = temp;
        }
        printArr(darr1);
        printArr(darr2);

        ListNode ret = new ListNode();
        var currNode = ret;

        int carry = 0;
        for (int i = 0; i < darr1.size(); i++) {
            int sum = 0;
            if (i >= darr2.size()) {
                sum = carry + darr1.get(i);
            } else {
                sum = carry + darr1.get(i) + darr2.get(i);
            }
            currNode.next = new ListNode(sum % 10);
            currNode = currNode.next;
            carry = sum / 10;
        }

        if (carry == 1) {
            currNode.next = new ListNode(1);
        }

        return ret.next;
    }
}
// @lc code=end
