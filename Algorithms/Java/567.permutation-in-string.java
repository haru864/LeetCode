import java.util.HashSet;

/*
 * @lc app=leetcode id=567 lang=java
 *
 * [567] Permutation in String
 */

// @lc code=start
class Solution {

    public boolean checkInclusion(String s1, String s2) {

        int[] arr1 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] arr2 = new int[26];
            for (int j = 0; j < s1.length(); j++) {
                arr2[s2.charAt(i + j) - 'a']++;
                if (isSame(arr1, arr2))
                    return true;
            }
        }

        return false;
    }

    public boolean isSame(int[] arr1, int[] arr2) {

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

    public void printArr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("");
        return;
    }
}
// @lc code=end
