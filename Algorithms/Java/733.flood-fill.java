import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

import javax.management.Query;

/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution {

    int[] rList = new int[] { -1, 0, 0, 1 };
    int[] cList = new int[] { 0, -1, 1, 0 };

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {

        int h = image.length;
        int w = image[0].length;
        int color = image[sr][sc];

        boolean[][] seen = new boolean[h][w];

        Queue<List<Integer>> q = new ArrayDeque<>();
        q.add(new ArrayList<>(Arrays.asList(sr, sc)));
        // System.out.println(q.peek());

        while (!q.isEmpty()) {

            List<Integer> coordinate = q.poll();
            // System.out.println(coordinate);
            image[coordinate.get(0)][coordinate.get(1)] = newColor;
            seen[coordinate.get(0)][coordinate.get(1)] = true;

            for (int i = 0; i < 4; i++) {

                int r = coordinate.get(0) + rList[i];
                int c = coordinate.get(1) + cList[i];

                if (r < 0 || r >= h || c < 0 || c >= w)
                    continue;
                if (image[r][c] != color)
                    continue;
                if (seen[r][c])
                    continue;

                q.add(new ArrayList<>(Arrays.asList(r, c)));
            }
        }

        return image;

    }
}
// @lc code=end
