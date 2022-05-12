/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
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

    public boolean isPalindrome(ListNode head) {

        StringBuilder s = new StringBuilder();
        while (head != null) {
            s.append(Integer.toString(head.val));
            head = head.next;
        }

        int mid = s.length() / 2;
        int left, right;
        left = right = 0;

        if (s.length() % 2 == 0) {
            left = mid - 1;
            right = mid;
        } else {
            left = mid - 1;
            right = mid + 1;
        }

        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left--;
            right++;
        }

        return true;
    }
}
// @lc code=end
