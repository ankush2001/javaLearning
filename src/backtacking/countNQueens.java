package backtacking;

public class countNQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
       System.out.println( countNQueens(board, 0));
    }
    public static int countNQueens(boolean[][] board, int row) {
        //base case
        if (row == board.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board[row].length; col++) {
            if (isItSafe(board, row, col)) {
                board[row][col] = true;
                count = count + countNQueens(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isItSafe(boolean[][] board, int row, int col) {
        for (int i = row; i >= 0; i--) {
            if (board[i][col]) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }
}