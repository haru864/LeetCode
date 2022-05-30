import java.util.HashMap;

/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i) - 'a']++;
            arr2[t.charAt(i) - 'a']++;
        }
        printArr(arr1);
        printArr(arr2);

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }

        return true;
    }

    public void printArr(int[] arr) {
        for (var n : arr) {
            System.out.print(n);
        }
        System.out.println("\n");
    }
}
// @lc code=end
