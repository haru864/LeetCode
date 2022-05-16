import java.util.ArrayList;
import java.util.Collection;

/*
 * @lc app=leetcode id=1790 lang=java
 *
 * [1790] Check if One String Swap Can Make Strings Equal
 */

// @lc code=start
class Solution {

    public boolean areAlmostEqual(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        int count = 0;
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                count++;
                arr1.add(s1.charAt(i));
                arr2.add(s2.charAt(i));
            }
        }

        if (count == 0) {
            return true;
        } else if (count == 2) {
            Collections.sort(arr1);
            Collections.sort(arr2);
            return arr1.equals(arr2);
        }

        return false;
    }
}
// @lc code=end
