import java.util.HashSet;

/*
 * @lc app=leetcode id=36 lang=java
 *
 * [36] Valid Sudoku
 */

// @lc code=start
class Solution {

    public boolean isValidSudoku(char[][] board) {

        boolean isValidSudoku = true;

        isValidSudoku &= isValidRow(board);
        isValidSudoku &= isValidColumn(board);
        isValidSudoku &= isValidBox(board);

        return isValidSudoku;
    }

    public boolean isValidRow(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> hs = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (hs.contains(board[i][j]))
                    return false;
                hs.add(board[i][j]);
            }
        }

        return true;
    }

    public boolean isValidColumn(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> hs = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.')
                    continue;
                if (hs.contains(board[j][i]))
                    return false;
                hs.add(board[j][i]);
            }
        }

        return true;
    }

    public boolean isValidBox(char[][] board) {

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                HashSet<Character> hs = new HashSet<>();
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i + l][j + k] == '.')
                            continue;
                        if (hs.contains(board[i + l][j + k]))
                            return false;
                        hs.add(board[i + l][j + k]);
                    }
                }
            }
        }

        return true;
    }
}
// @lc code=end
