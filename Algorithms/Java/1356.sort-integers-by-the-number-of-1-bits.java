import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

import javax.imageio.stream.IIOByteBuffer;

/*
 * @lc app=leetcode id=1356 lang=java
 *
 * [1356] Sort Integers by The Number of 1 Bits
 */

// @lc code=start
class Solution {

    HashMap<Integer, Integer> map;

    public int[] sortByBits(int[] arr) {

        map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int count = Integer.bitCount(arr[i]);
            // System.out.println(arr[i] + " " + count);
            map.put(arr[i], count);
        }

        Integer[] ans = copyArrAsInteger(arr);

        Arrays.sort(ans, new Comparator<Integer>() {

            @Override
            public int compare(Integer a, Integer b) {
                if (map.get(a.intValue()) < map.get(b.intValue())) {
                    return -1;
                } else if (map.get(a) > map.get(b)) {
                    return 1;
                } else {
                    return (a <= b) ? -1 : 1;
                }
            }
        });

        return copyArrAsInt(ans);
    }

    public Integer[] copyArrAsInteger(int[] arr) {

        Integer[] ret = new Integer[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ret[i] = Integer.valueOf(arr[i]);
        }

        return ret;
    }

    public int[] copyArrAsInt(Integer[] arr) {

        int[] ret = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i].intValue();
        }

        return ret;
    }
}
// @lc code=end
