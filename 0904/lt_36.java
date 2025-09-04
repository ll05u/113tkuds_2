// LeetCode 36: Valid Sudoku
// 檢查每列、每行、每個 3x3 宮格是否有重複
class lt_36 {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int num = board[i][j] - '1';
                int k = (i / 3) * 3 + (j / 3);
                if (row[i][num] || col[j][num] || box[k][num]) return false;
                row[i][num] = col[j][num] = box[k][num] = true;
            }
        }
        return true;
    }
}
