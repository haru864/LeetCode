import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;

/*
 * @lc app=leetcode id=1376 lang=java
 *
 * [1376] Time Needed to Inform All Employees
 */

// @lc code=start
class Solution {

    // ref
    // https://leetcode.com/problems/time-needed-to-inform-all-employees/discuss/532593/Java-BFS

    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        HashMap<Integer, Set<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.putIfAbsent(manager[i], new HashSet<Integer>());
            map.get(manager[i]).add(i);
        }

        Queue<int[]> q = new ArrayDeque<>();
        q.add(new int[] { -1, 0 });
        int max = 0;

        while (q.size() > 0) {
            int[] curr = q.poll();
            max = Math.max(max, curr[1]);
            if (map.get(curr[0]) == null)
                continue;
            for (var emp : map.get(curr[0])) {
                System.out.println(emp);
                q.add(new int[] { emp, curr[1] + informTime[emp] });
            }
        }

        return max;
    }
}
// @lc code=end
