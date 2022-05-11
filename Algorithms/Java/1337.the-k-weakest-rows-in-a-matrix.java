import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Queue;

/*
 * @lc app=leetcode id=1337 lang=java
 *
 * [1337] The K Weakest Rows in a Matrix
 */

// @lc code=start
class Solution {

    public int[] kWeakestRows(int[][] mat, int k) {

        HashMap<Integer, Queue<Integer>> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {

            int soldiers = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1)
                    soldiers++;
            }

            if (map.get(soldiers) == null) {
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                map.put(soldiers, q);
            } else {
                map.get(soldiers).add(i);
            }

            list.add(soldiers);
        }

        int[] ret = new int[k];
        Collections.sort(list);

        for (int i = 0; i < k; i++) {
            int num = list.get(i);
            ret[i] = map.get(num).poll();
        }

        return ret;
    }
}
// @lc code=end
