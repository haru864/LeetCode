import java.util.HashMap;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution {

    char[] roman = new char[] { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
    HashMap<Character, Integer> score;

    public int romanToInt(String s) {

        initialize();

        int[] numList = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            numList[i] = this.score.get(s.charAt(i));
            // System.out.print(numList[i]);
        }

        for (int i = 0; i < numList.length - 1; i++) {
            if (numList[i] < numList[i + 1]) {
                numList[i + 1] -= numList[i];
                numList[i] = 0;
            }
        }

        int total = 0;
        for (int n : numList) {
            total += n;
        }

        return total;
    }

    public void initialize() {

        this.score = new HashMap<>();
        this.score.put('I', 1);
        this.score.put('V', 5);
        this.score.put('X', 10);
        this.score.put('L', 50);
        this.score.put('C', 100);
        this.score.put('D', 500);
        this.score.put('M', 1000);
    }
}
// @lc code=end
