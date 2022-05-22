import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

/*
 * @lc app=leetcode id=953 lang=java
 *
 * [953] Verifying an Alien Dictionary
 */

// @lc code=start
class Solution {

    public boolean isAlienSorted(String[] words, String order) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            map.put(order.charAt(i), i);
        }

        String[] sorted = Arrays.copyOf(words, words.length);

        Arrays.sort(sorted, new Comparator<String>() {

            @Override
            public int compare(String s, String t) {

                for (int i = 0; i < Math.min(s.length(), t.length()); i++) {
                    char c1 = s.charAt(i);
                    char c2 = t.charAt(i);
                    if (map.get(c1) > map.get(c2)) {
                        return 1;
                    } else if (map.get(c1) < map.get(c2)) {
                        return -1;
                    }
                }

                if (s.length() == t.length()) {
                    return 0;
                }

                return s.length() < t.length() ? -1 : 1;
            }
        });
        printArray(sorted);

        for (int i = 0; i < sorted.length; i++) {
            if (!sorted[i].equals(words[i]))
                return false;
        }

        return true;
    }

    public void printArray(String[] arr) {
        for (var s : arr) {
            System.out.print(s + " ");
        }
        System.out.print("\n");
    }
}
// @lc code=end
