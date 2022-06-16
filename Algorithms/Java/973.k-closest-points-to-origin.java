import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import java.lang.Math;

/*
 * @lc app=leetcode id=973 lang=java
 *
 * [973] K Closest Points to Origin
 */

// @lc code=start
class Solution {

    public int[][] kClosest(int[][] points, int k) {

        List<List<Long>> list = new ArrayList<>();

        for (int i = 0; i < points.length; i++) {
            long dist = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            List<Long> currList = new ArrayList<>();
            currList.add(dist);
            currList.add((long)i);
            list.add(currList);
            // System.out.println(currList.get(0));
        }

        Comparator<List<Long>> comparator = new Comparator<>() {
            @Override
            public int compare(List<Long> a, List<Long> b) {
                return (a.get(0) <= b.get(0)) ? -1 : 1;
            }
        };

        Collections.sort(list, comparator);
        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            // System.out.println(list.get(i).get(1));
            int j =list.get(i).get(1).intValue();
            ans[i][0] = points[j][0];
            ans[i][1] = points[j][1];
        }

        return ans;
    }
}
// @lc code=end
